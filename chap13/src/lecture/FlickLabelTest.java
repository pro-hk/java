package lecture;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

class FlickLabel extends JLabel implements Runnable {
	private long delay;
	public FlickLabel(String txt, long delay) {
		super(txt);
		this.delay = delay;
		setOpaque(true);
		Thread thread = new Thread(this);
		thread.start();
	}
	
	@Override
	public void run() {
		boolean isFlick = false;
		while(true) {
			isFlick = !isFlick;
			if(isFlick) this.setBackground(Color.YELLOW);
			else this.setBackground(Color.GREEN);
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	} 
	
}

public class FlickLabelTest extends JFrame {
	public FlickLabelTest() {
		setTitle("Flick");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		FlickLabel label01 = new FlickLabel("I Love Java", 100);
		JLabel label02 = new JLabel(" VS ");
		FlickLabel label03 = new FlickLabel("I Hate Java", 200);
		
		contentPane.add(label01);
		contentPane.add(label02);
		contentPane.add(label03);
				
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new FlickLabelTest();
	}
}
