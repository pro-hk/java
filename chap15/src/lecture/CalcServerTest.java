package lecture;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;

public class CalcServerTest {
	public static void main(String[] args) {
		ServerSocket listener = null;
		Socket socket = null;
		BufferedReader input = null;
		BufferedWriter output = null;
		
		try {
			listener = new ServerSocket(9999);
			System.out.println("서버가 클라이언트의 연결을 기다리고 있습니다.");
			socket = listener.accept();
			System.out.println("클라이언트와 연결되었습니다.");
			input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			output = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				String result = "";
				String inputMsg = input.readLine(); // 10 + 10
				StringTokenizer st = new StringTokenizer(inputMsg," ");
				int total = st.countTokens();  // 10, +, 10
				if(total>3 || total<3) return;
				int num01 = Integer.parseInt(st.nextToken());
				String calcOperator = st.nextToken();
				int num02 = Integer.parseInt(st.nextToken());
				if(calcOperator.equals("+")) {
					result = ""+(num01+num02);
				} else if(calcOperator.equals("-")) {
					result = ""+(num01-num02);
				} else if(calcOperator.equals("*")) {
					result = ""+(num01*num02);
				}
				output.write(result+"\r\n");
				output.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
