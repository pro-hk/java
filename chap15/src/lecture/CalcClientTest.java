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
				System.out.println("계산식 입력하면 서버가 계산결과를 알려줍니다. ex) 10 + 10");   // 띄어쓰기 해야됨(문자와 숫자 구분함..)
				String outputMsg = scanner.nextLine();
				output.write(outputMsg+"\r\n");
				output.flush();
				String inputMsg = input.readLine();
				System.out.println("서버가 넘겨준"+outputMsg+"의 결과는 "+inputMsg+"입니다.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		scanner.close();
	}
}
