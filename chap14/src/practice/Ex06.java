package practice;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ex06 extends JFrame {
	private JLabel resultLabel = new JLabel("계산 결과 출력");
	
	public Ex06() {
		setTitle("다이얼로그 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		JButton btn = new JButton("calculate");
		btn.addActionListener(new MyActionListener());
		
		resultLabel.setOpaque(true);
		resultLabel.setBackground(Color.green);
		
		add(btn);
		add(resultLabel);
		
		setSize(300,300);
		setVisible(true);
	}
	
	class MyActionListener implements ActionListener {
		private CalcDialog calcDialog;
		
		public MyActionListener() {
			calcDialog = new CalcDialog(Ex06.this);
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			calcDialog.setVisible(true);
			resultLabel.setText(Integer.toString(calcDialog.getSum()));
		}
		
	}
	
	class CalcDialog extends JDialog {
		private JTextField tf01 = new JTextField(15); 
		private JTextField tf02 = new JTextField(15); 
		private JButton btn = new JButton("Add");
		private int sum = 0;
		
		public CalcDialog(JFrame frame) {
			super(frame,"Calculation Dialog",true);  // true : 모달 - 다른 행동 못함
			setLayout(new FlowLayout());
			
			add(new JLabel("두 수를 더합니다."));
			add(tf01);
			add(tf02);
			add(btn);
			
			btn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					try {
						int txt01 = Integer.parseInt(tf01.getText());
						int txt02 = Integer.parseInt(tf02.getText());
						sum = txt01 + txt02;
					} catch (Exception e2) {
//						e2.printStackTrace();
						JOptionPane.showMessageDialog(null, "숫자를 입력하세요","Alert",JOptionPane.ERROR_MESSAGE);
						return;
					}
					setVisible(false);
					tf01.setText("");
					tf02.setText("");
				}
			});
			setSize(200,200);
		}
		
		public int getSum() {
			return sum;
		}
	}
	
	public static void main(String[] args) {
		new Ex06();
	}
}
