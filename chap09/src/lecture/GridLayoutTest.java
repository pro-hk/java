package lecture;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridLayoutTest extends JFrame {
	public GridLayoutTest() {
		setTitle("GRID LAYOUT TEST");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(100, 100);
		
		Container contentPane = this.getContentPane();
//		GridLayout grid = new GridLayout(4,2);
//		grid.setVgap(10);
		contentPane.setLayout(new GridLayout(4,2,10,20)); // ��, ��, �¿쿩��, ���Ͽ���
		contentPane.add(new JLabel("�̸�"));
		contentPane.add(new JTextField(""));
		contentPane.add(new JLabel("�й�"));
		contentPane.add(new JTextField(""));
		contentPane.add(new JLabel("�а�"));
		contentPane.add(new JTextField(""));
		contentPane.add(new JLabel("����"));
		contentPane.add(new JTextField(""));
		
		this.setSize(300, 200);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new GridLayoutTest();
	}
}
