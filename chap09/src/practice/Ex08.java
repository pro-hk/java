package practice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class btnsPanel extends JPanel {
	public btnsPanel() {
		setLayout(new FlowLayout());
		setOpaque(true);
		setBackground(Color.LIGHT_GRAY);
		String btns[] = { "열기", "닫기", "나가기" };
		for (int i = 0; i < btns.length; i++) {
			add(new JButton(btns[i]));
		}
	}
}

class starPanel extends JPanel {
	public starPanel() {
		setLayout(null);
		setOpaque(true);
		setBackground(Color.white);
		for (int i = 0; i < 10; i++) {
			JLabel label = new JLabel("*");
			label.setForeground(Color.red);
			label.setSize(20,20);
			int x = (int) (Math.random() * 150 + 50);
			int y = (int) (Math.random() * 100 + 50);
			label.setLocation(x, y);
			add(label);
		}
	}
}

class inputPanel extends JPanel {
	public inputPanel() {
		setLayout(new FlowLayout());
		setOpaque(true);
		setBackground(Color.yellow);
		add(new JButton("Word Input"));
		add(new JTextField(16));
	}
}

public class Ex08 extends JFrame {
	public Ex08() {
		setTitle("여러 개의 패널을 가진 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new BorderLayout());

		btnsPanel btnsPanel = new btnsPanel();
		starPanel starPanel = new starPanel();
		inputPanel inputPanel = new inputPanel();

		contentPane.add(btnsPanel, BorderLayout.NORTH);
		contentPane.add(starPanel, BorderLayout.CENTER);
		contentPane.add(inputPanel, BorderLayout.SOUTH);

		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex08();
	}
}
