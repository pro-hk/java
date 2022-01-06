package lecture;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

class RandomTxt extends Thread {
	private boolean isStop = false; // ป๓ลย..state
	private Container container;
	
	public void finish() {
		isStop = true;
	}
	
	public RandomTxt(Container container) {
		this.container = container;
	}
	
	public void run() {
		while(true) {
			int x = (int)(Math.random()*container.getWidth());
			int y = (int)(Math.random()*container.getHeight());
			JLabel label = new JLabel("random");
			label.setSize(80,20);
			label.setLocation(x,y);
			container.add(label);
			container.repaint();
			
			try {
				sleep(300);
				if(isStop) {
					container.removeAll();
					label = new JLabel("FINISH");
					label.setSize(80,20);
					label.setLocation(container.getWidth()/2-40,container.getHeight()/2-20);
					container.add(label);
					container.repaint();
					return;
				}
			} catch (InterruptedException e) {
				return;
			}
		}
	}
	
}

public class RandomTest extends JFrame {
	private RandomTxt randomTxt;
	
	public RandomTest() {
		setTitle("RandomTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setLayout(null);
		
		randomTxt = new RandomTxt(contentPane);
		randomTxt.start();
		
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				randomTxt.finish();
			}
		});
		
		setSize(500,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new RandomTest();
	}
}
