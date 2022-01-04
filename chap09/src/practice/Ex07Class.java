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

class NorthPanel extends JPanel {
	public NorthPanel() {
		setLayout(new FlowLayout());
		setOpaque(true);
		setBackground(Color.LIGHT_GRAY);
		add(new JLabel("수식입력"));
		add(new JTextField(16));
	}
}

class CenterPanel extends JPanel {
	public CenterPanel() {
		this.setLayout(new GridLayout(4, 4, 5, 5));
		for (int i = 0; i < 10; i++) {
			JButton btns = new JButton(Integer.toString(i));
			this.add(btns);
		}
		this.add(new JButton("CE"));
		this.add(new JButton("계산"));
		String marks[] = { "+", "-", "x", "/" };
		for (int j = 0; j < 4; j++) {
			JButton btns = new JButton(marks[j]);
			btns.setOpaque(true);
			btns.setBackground(Color.cyan);
			this.add(btns);
		}
	}
}

class SouthPanel extends JPanel{
	public SouthPanel() {
		this.setLayout(new FlowLayout());
		this.setOpaque(true);
		this.setBackground(Color.orange);
		this.add(new JLabel("계산결과"));
		this.add(new JTextField(16));
	}
}

public class Ex07Class extends JFrame {
	public Ex07Class() {
		setTitle("계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new BorderLayout());

		NorthPanel northPanel = new NorthPanel();
		CenterPanel centerPanel = new CenterPanel();
		SouthPanel southPanel = new SouthPanel();

		contentPane.add(northPanel, BorderLayout.NORTH);
		contentPane.add(centerPanel, BorderLayout.CENTER);
		contentPane.add(southPanel, BorderLayout.SOUTH);

		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex07Class();
	}
}
