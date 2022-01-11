package lecture;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerTest {
	public static void main(String[] args) {
		ServerSocket listener = null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);
		BufferedReader input = null;
		BufferedWriter output = null;
		try {
			listener = new ServerSocket(9999); // ��Ʈ��ȣ : �ּ� 2000 �̻����� ���.. 1õ������� �����Ǿ�����
			socket = listener.accept();
			System.out.println("Ŭ���̾�Ʈ ������ ����Ǿ����ϴ�.");
			input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			output = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
//				String outputMsg = scanner.nextLine();
//				output.write(outputMsg);
				String inputMsg = input.readLine();
				if(inputMsg.equalsIgnoreCase("bye")) {  // ��ҹ��� ����
					  System.out.println("client���� �̺��� ����..");
					  break;
				}
				System.out.println("client�� ���� �޽��� : "+inputMsg);
				// ��������..
				System.out.println("server�� ������ �޽��� >>");
				String outputMsg = scanner.nextLine();
				output.write(outputMsg+"\r\n");
				output.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			scanner.close();
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		scanner.close();
	}
}
