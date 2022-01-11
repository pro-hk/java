package lecture;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientTest {
	public static void main(String[] args) {
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);
		BufferedReader input = null;
		BufferedWriter output = null;
//		socket = new Socket("localhost",9999);
		try {
			socket = new Socket("127.0.0.1",9999);  // ip�ּ�, ��Ʈ��ȣ
			input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			output = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				System.out.println("client���� ���� �޽��� >> ");
				String outputMsg = scanner.nextLine();
				if(outputMsg.equalsIgnoreCase("bye")) {
					output.write(outputMsg+"\r\n");
					output.flush();    // ���ۿ� �������� �Ѿ -- flush : �뷮�� ������ �Ѿ
					break;
				}
				output.write(outputMsg+"\r\n");
				output.flush();    // ���ۿ� �������� �Ѿ -- flush : �뷮�� ������ �Ѿ
				
				String inputMsg = input.readLine();
				System.out.println("server�� ���� �޽��� : " + inputMsg);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		scanner.close();
	}
}
