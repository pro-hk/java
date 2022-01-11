package lecture;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class CalcClientTest {
	public static void main(String[] args) {
		Socket socket =null;
		BufferedReader input = null;
		BufferedWriter output = null;
		Scanner scanner = new Scanner(System.in);
		try {
			socket = new Socket("localhost",9999);
			input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			output = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				System.out.println("���� �Է��ϸ� ������ ������� �˷��ݴϴ�. ex) 10 + 10");   // ���� �ؾߵ�(���ڿ� ���� ������..)
				String outputMsg = scanner.nextLine();
				output.write(outputMsg+"\r\n");
				output.flush();
				String inputMsg = input.readLine();
				System.out.println("������ �Ѱ���"+outputMsg+"�� ����� "+inputMsg+"�Դϴ�.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		scanner.close();
	}
}
