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
		contentPane.setLayout(new GridLayout(4,2,10,20)); // 행, 열, 좌우여백, 상하여백
		contentPane.add(new JLabel("이름"));
		contentPane.add(new JTextField(""));
		contentPane.add(new JLabel("학번"));
		contentPane.add(new JTextField(""));
		contentPane.add(new JLabel("학과"));
		contentPane.add(new JTextField(""));
		contentPane.add(new JLabel("과목"));
		contentPane.add(new JTextField(""));
		
		this.setSize(300, 200);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new GridLayoutTest();
	}
}
