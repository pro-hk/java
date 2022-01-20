package selfJDBC;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JDBC_SWING extends JFrame {
	JButton searchBtn;
	
	public JDBC_SWING() {
		setTitle("JDBC_SWING");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setLayout(null);
		
		JTextField txt = new JTextField(20);
		txt.setLocation(50, 30);
		txt.setSize(100, 30);
		searchBtn = new JButton("°Ë»ö");
		searchBtn.setLocation(150,30);
		searchBtn.setSize(80,30);
		
		contentPane.add(txt);
		contentPane.add(searchBtn);
		
		setSize(500,500);
		setVisible(true);
	}

	
	public static void main(String[] args) {
		new JDBC_SWING();
	}
}
