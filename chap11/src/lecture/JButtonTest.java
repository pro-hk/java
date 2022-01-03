package lecture;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtonTest extends JFrame {
	public JButtonTest() {
		setTitle("컴퍼넌트 메서드 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JButton txtButton = new JButton("I LOVE JAVA");
		JButton imgButton = new JButton(new ImageIcon("images/phone.png"));
		imgButton.setBorderPainted(false);
		imgButton.setContentAreaFilled(false);
		imgButton.setFocusable(false);
		imgButton.setOpaque(false);
		imgButton.setRolloverIcon(new ImageIcon("images/heart.png"));
		imgButton.setPressedIcon(new ImageIcon("images/phone.png"));
		
		contentPane.add(txtButton);
		contentPane.add(imgButton);
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JButtonTest();
	}
}
