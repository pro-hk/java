package lecture;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

class FlickLabel02 extends JLabel implements Runnable {
	private long delay;
	private Color flickColor;
	private Color normalColor;
	
	public FlickLabel02(String txt, long delay, Color flickColor, Color normalColor) {
		super(txt);  // or setText(txt)
		this.delay = delay;
		this.flickColor = flickColor;
		this.normalColor = normalColor;
		setOpaque(true); // 불투명처리..
		thStart();
	}
	
	public void thStart() {
		Thread thread = new Thread(this);
		thread.start();
	}
	
	@Override
	public void run() {
		boolean isFlick = false;
		while(true) {
			isFlick = !isFlick;
			if(isFlick) this.setBackground(flickColor);
			else this.setBackground(normalColor);
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	} 
	
}

public class FlickLabelTest02 extends JFrame {
	public FlickLabelTest02() {
		setTitle("Flick");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		FlickLabel02 label01 = new FlickLabel02("I Love Java", 100, Color.red, Color.black);
		JLabel label02 = new JLabel(" VS ");
		FlickLabel02 label03 = new FlickLabel02("I Hate Java", 200, Color.blue, Color.green);
		
		contentPane.add(label01);
		contentPane.add(label02);
		contentPane.add(label03);
				
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new FlickLabelTest02();
	}
}
