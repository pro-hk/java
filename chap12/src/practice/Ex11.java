package practice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ex11 extends JFrame {
	private ChartPanel chartPanel = new ChartPanel();
	private String labels[] = { "apple", "cherry", "strawberry", "prune" };
	private JTextField tfList[] = new JTextField[4];
	private int arcList[] = new int[4];
	private int dataList[] = { 0, 0, 0, 0 };
	private Color colors[] = { Color.red, Color.blue, Color.magenta, Color.yellow };

	public Ex11() {
		setTitle("파이 차트 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = this.getContentPane();
		contentPane.setLayout(new BorderLayout());
		contentPane.add(new InputPanel(), BorderLayout.NORTH);
		contentPane.add(chartPanel, BorderLayout.CENTER);

		setSize(500, 500);
		setVisible(true);
	}

	class InputPanel extends JPanel {
		public InputPanel() {
			setBackground(Color.lightGray);
			for (int i = 0; i < 4; i++) {
				tfList[i] = new JTextField("0", 5);
				tfList[i].addActionListener(new MyActionListener());
				add(new JLabel(labels[i]));
				add(tfList[i]);
			}
		}
	}

	class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			int sum = 0;
			for (int i = 0; i < 4; i++) {
				dataList[i] = Integer.parseInt(tfList[i].getText());
				sum += dataList[i];
			}
			for (int i = 0; i < 4; i++) {
				arcList[i] = (int)((double)dataList[i] / (double)sum * 360);
			}
			chartPanel.repaint();
		}
	}

	class ChartPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			int startAngle = 0;
			for (int i = 0; i < tfList.length; i++) {
				g.setColor(colors[i]);
				g.fillArc(150, 150, 200, 200, startAngle, arcList[i]);
				startAngle += arcList[i];
			}
		}
	}

	public static void main(String[] args) {
		new Ex11();
	}
}
