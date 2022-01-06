package lecture;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerRunnableLabel02 implements Runnable{
	private JLabel label;
	public TimerRunnableLabel02(JLabel label) {
		this.label = label;
	}
	
	@Override
	public void run() {
		int num = 0;
		while(true) {
			label.setText(Integer.toString(num));
			num++;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("∏ÿ√„");
				return;
			}
		}
	}
	
}

public class TimerRunnableLabelTest extends JFrame {
	private Thread th;
	public TimerRunnableLabelTest() {
		setTitle("TimerRunnableLabelTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JLabel label = new JLabel();
		label.setFont(new Font("∏º¿∫ ∞ÌµÒ",Font.BOLD,48));
		
		TimerRunnableLabel02 runnable = new TimerRunnableLabel02(label);
		th = new Thread(runnable);
		
		JButton btn = new JButton("STOP");
		JButton btns = new JButton("START");
		
		contentPane.add(label);
		contentPane.add(btn);
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btn.setEnabled(false);
				th.interrupt();
			}
		});
		
		th.start();

		setSize(500,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TimerRunnableLabelTest();
	}
}
