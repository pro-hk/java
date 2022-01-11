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
			listener = new ServerSocket(9999); // 포트번호 : 최소 2000 이상으로 사용.. 1천번대까지 지정되어있음
			socket = listener.accept();
			System.out.println("클라이언트 소켓이 연결되었습니다.");
			input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			output = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
//				String outputMsg = scanner.nextLine();
//				output.write(outputMsg);
				String inputMsg = input.readLine();
				if(inputMsg.equalsIgnoreCase("bye")) {  // 대소문자 무시
					  System.out.println("client에서 이별을 고함..");
					  break;
				}
				System.out.println("client가 보낸 메시지 : "+inputMsg);
				// 내보내기..
				System.out.println("server가 보내는 메시지 >>");
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
