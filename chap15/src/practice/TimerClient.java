package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class TimerClient {
	public static void main(String[] args) {
		Socket socket = null;
		BufferedWriter output = null;
		BufferedReader input = null;
		try {
			socket = new Socket("localhost", 9999);
			System.out.println("������ �����Ͽ����ϴ�.");
			input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String inputMsg = "";
			System.out.print("������ �ð� :");
			while(true) {
				inputMsg = input.readLine();
				System.out.print(" "+inputMsg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
