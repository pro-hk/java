package practice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ex07 extends JFrame {
	public Ex07() {
		setTitle("계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		JPanel northPanel = new JPanel();
		northPanel.setLayout(new FlowLayout());
		northPanel.setOpaque(true);
		northPanel.setBackground(Color.LIGHT_GRAY);
		northPanel.add(new JLabel("수식입력"));
		northPanel.add(new JTextField(16));
		
		String marks[] = {"+","-","x","/"};
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new GridLayout(4,4,5,5));
		for(int i=0;i<10;i++) {
			JButton btns = new JButton(Integer.toString(i));
			centerPanel.add(btns);
		}
		centerPanel.add(new JButton("CE"));
		centerPanel.add(new JButton("계산"));
		for(int i=0; i<4;i++) {
			JButton btns = new JButton(marks[i]);
			btns.setOpaque(true);
			btns.setBackground(Color.cyan);
			centerPanel.add(btns);
		}
		JPanel southPanel = new JPanel();
		southPanel.setLayout(new FlowLayout());
		southPanel.setOpaque(true);
		southPanel.setBackground(Color.orange);
		southPanel.add(new JLabel("계산결과"));
		southPanel.add(new JTextField(16));
		
		contentPane.add(northPanel,BorderLayout.NORTH);
		contentPane.add(centerPanel,BorderLayout.CENTER);
		contentPane.add(southPanel,BorderLayout.SOUTH);
		
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex07();
	}
}
