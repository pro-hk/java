package lecture;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FirstFrame extends JFrame {
	public FirstFrame() {
		setSize(300, 300);   // ������ ����
		setVisible(true);   // ȭ�鿡 ǥ��
		this.setTitle("my first frame");  // Ÿ��Ʋ �ޱ�
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �ݱ� ������ ����
		// �⺻����
		Container contentPane = this.getContentPane();  // JFrame ������ ��������� �⺻ �г� ��������
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());   // ��ġ������
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("CLICK"));
	}
	public static void main(String[] args) {
		FirstFrame myFrame = new FirstFrame();
	}
}
