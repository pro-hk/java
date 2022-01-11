package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

class TimerThread extends Thread {
	private BufferedWriter output;

	public TimerThread(BufferedWriter output) {
		this.output = output;
	}

	public void run() {
		try {
			for (int i = 0; i < 20; i++) {
				try {
					sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				output.write("" + i + "\r\n");
				output.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

public class TimerServer {
	public static void main(String[] args) {
		ServerSocket listener = null;
		Socket socket = null;
		BufferedWriter output = null;
		BufferedReader input = null;
		try {
			listener = new ServerSocket(9999);
			socket = listener.accept();
			System.out.println("연결되었습니다.");
			output = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			TimerThread timerThread = new TimerThread(output);
			timerThread.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
