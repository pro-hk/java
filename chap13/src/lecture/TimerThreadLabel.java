package lecture;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class LabelTimer extends Thread{
	private JLabel timerLabel;
	
	public LabelTimer(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
	
	public void run() {
		int num = 0;
		while(true) {
			timerLabel.setText(Integer.toString(num));
			num++;
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}

public class TimerThreadLabel extends JFrame {
	public TimerThreadLabel() {
		setTitle("Thread ¿¬½À");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("¸¼Àº °íµñ",Font.BOLD,36));
		contentPane.add(timerLabel);
		
		LabelTimer labelTimer = new LabelTimer(timerLabel);
		labelTimer.start();
		
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TimerThreadLabel();
	}
}
