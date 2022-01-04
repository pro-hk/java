package lecture;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JTextFieldTest extends JFrame {
	public JTextFieldTest() {
		setTitle("�ؽ�Ʈ�ʵ� �׽�Ʈ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JLabel("�̸�"));
		contentPane.add(new JTextField("�̸��� ������", 20));
		contentPane.add(new JLabel("�а�"));
		contentPane.add(new JTextField("�а��� ������", 20));
		contentPane.add(new JLabel("�ּ�"));
		contentPane.add(new JTextField("�ּҸ� ������", 20));
		
		contentPane.add(new JScrollPane(new JTextArea("���� ���� ���� �ٴ� ����..",5,25))); // 5�� 20��  
		// JScrollPane : ��ũ�� ����
		
		setSize(280, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JTextFieldTest();
	}
}
