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
			socket = new Socket("127.0.0.1",9999);  // ip주소, 포트번호
			input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			output = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				System.out.println("client에서 보낸 메시지 >> ");
				String outputMsg = scanner.nextLine();
				if(outputMsg.equalsIgnoreCase("bye")) {
					output.write(outputMsg+"\r\n");
					output.flush();    // 버퍼에 차야지만 넘어감 -- flush : 용량이 안차도 넘어감
					break;
				}
				output.write(outputMsg+"\r\n");
				output.flush();    // 버퍼에 차야지만 넘어감 -- flush : 용량이 안차도 넘어감
				
				String inputMsg = input.readLine();
				System.out.println("server가 보낸 메시지 : " + inputMsg);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		scanner.close();
	}
}
