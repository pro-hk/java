package practice;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Ex01 extends JFrame {
	public Ex01() {
		setTitle("Ex01");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JCheckBox cbDisable = new JCheckBox("��ư ��Ȱ��ȭ");
		JCheckBox cbHide = new JCheckBox("��ư ���߱�");
		
		JButton bts = new JButton("test button");
		
		contentPane.add(cbDisable);
		contentPane.add(cbHide);
		contentPane.add(bts);
		
		setSize(500,500);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Ex01();
	}
}
