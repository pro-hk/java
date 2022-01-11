package Chatting;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Chatting.ChattingClient.Receiver;

public class ChattingServer extends JFrame {
	private JTextField sender;
	private ServerSocket listener = null;
	private Socket socket = null;
	private BufferedReader input = null;
	private BufferedWriter output = null;
	private Receiver receiver = null;
	
	public ChattingServer() {
		setTitle("채팅-서버");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		sender = new JTextField();
		sender.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String msg = sender.getText();
				try {
					output.write(msg+"\r\n");
					output.flush();
					receiver.append("\r\n 서버 :"+msg);
					sender.setText("");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		receiver = new Receiver();
		receiver.setBackground(Color.blue);
		receiver.setForeground(Color.white);
		
		contentPane.add(sender,BorderLayout.SOUTH);
		contentPane.add(new JScrollPane(receiver),BorderLayout.CENTER);
		try {
			setup();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Thread th = new Thread(receiver);
		th.start();
		
		setSize(500,500);
		setVisible(true);
	}
	
	private void setup() throws IOException {
		listener = new ServerSocket(9999);
		socket = listener.accept();
		input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		output = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
	}
	
	class Receiver extends JTextArea implements Runnable {
		@Override
		public void run() {
			String msg = null;
			while(true) {
				try {
					msg = input.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
				append("\r\n 클라이언트 : "+msg);
				int endPos = this.getText().length();
				setCaretPosition(endPos);
			}
		}
	}
	
	public static void main(String[] args) {
		new ChattingServer();
	}
}
