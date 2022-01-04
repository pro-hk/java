package lecture;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class JLabelTest extends JFrame {
	public JLabelTest() {
		setTitle("컴퍼넌트 메서드 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JLabel txtLabel = new JLabel("I LOVE JAVA");
		ImageIcon imageIcon = new ImageIcon("images/heart.png");
		ImageIcon phoneIcon = new ImageIcon("images/phone.png");
		JLabel imageLabel = new JLabel(imageIcon);
		JLabel txtAndImgLabel = new JLabel("CALL ME",phoneIcon,SwingConstants.CENTER);
		
		contentPane.add(txtLabel);
		contentPane.add(imageLabel);
		contentPane.add(txtAndImgLabel);
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JLabelTest();
	}
}
