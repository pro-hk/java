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
			System.out.println("서버에 접속하였습니다.");
			input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String inputMsg = "";
			System.out.print("서버의 시간 :");
			while(true) {
				inputMsg = input.readLine();
				System.out.print(" "+inputMsg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
