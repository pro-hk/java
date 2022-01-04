package lecture;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

class JCheckBoxTest extends JFrame {
	public JCheckBoxTest() {
		this.setTitle("üũ�ڽ� �׽�Ʈ");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		ImageIcon cherryIcon = new ImageIcon("images/lemons.png");
		
		JCheckBox apple = new JCheckBox("���");
		JCheckBox berry = new JCheckBox("����",true);
		JCheckBox lemon = new JCheckBox("����",cherryIcon);
		
		contentPane.add(apple);
		contentPane.add(berry);
		contentPane.add(lemon);
		
		lemon.setBorderPainted(true);
		
		this.setSize(300,300);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new JCheckBoxTest();
	}
}