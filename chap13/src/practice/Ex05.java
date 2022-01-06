package practice;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class ChickenThread extends Thread {
	private JLabel target;

	public ChickenThread(JLabel target) {
		this.target = target;
	}

	public void run() {
		while (true) {
			try {
				sleep(20);
			} catch (InterruptedException e) {
				try {
					sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
				}
			}
			int x = target.getX() + 5;
			int y = target.getY();
			if (x > 500)
				target.setLocation(-64, y);
			else
				target.setLocation(x, y);
			target.getParent().repaint();
		}
	}
}

class BulletThread extends Thread {
	private JLabel target;
	private JLabel chicken;
	private Thread chickenTh;
	
	public BulletThread(JLabel target, JLabel chicken, Thread chickenTh) {
		this.target = target;
		this.chicken = chicken;
		this.chickenTh = chickenTh;
	}

	public void run() {
		while (true) {
			try {
				sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(hitChicken()) {
				target.setLocation(250 - 5, 500 - 64 - 10);
				chickenTh.interrupt();
				return;
			} else {
			int x = target.getX();
			int y = target.getY() - 5;
			if (y < -10) {
				target.setLocation(250 - 5, 500 - 64 - 10);
				target.getParent().repaint();
				return;
			} else {
				target.setLocation(x, y);
			}
			target.getParent().repaint();
			}
		}
	}
	// 충돌..
//	Rectangle rect = new Rectangle();
	private boolean hitChicken() {
		if(targetContains(target.getX(), target.getY())) {
			return true;
		} else return false;
	}
	
	private boolean targetContains(int x, int y) {
		if(
			((chicken.getX()<= x ) && (chicken.getX() + chicken.getWidth() >= x)) && 
		    ((chicken.getY()<= y ) && (chicken.getY() + chicken.getHeight() >= y))
			) return true;
		return false;
	}
}

class gamePanel extends JPanel {
	private JLabel chicken;
	private JLabel tank;
	private JLabel bullet;
	
	private ChickenThread chickenTh;
	private BulletThread bulletTh;

	public gamePanel() {
		setLayout(null);
		setPreferredSize(new Dimension(500, 500));

		ImageIcon imgChicken = new ImageIcon("images/chicken.png");
		chicken = new JLabel(imgChicken);
		chicken.setSize(imgChicken.getIconWidth(), imgChicken.getIconHeight());
		chicken.setLocation(0, 0);

		ImageIcon imgTank = new ImageIcon("images/tank.png");
		tank = new JLabel(imgTank);
		tank.setSize(imgTank.getIconWidth(), imgTank.getIconHeight());
		tank.setLocation(250 - 32, 500 - 64);

		bullet = new JLabel();
		bullet.setOpaque(true);
		bullet.setBackground(Color.red);
		bullet.setSize(10, 10);
		bullet.setLocation(250 - 5, 500 - 64 - 10);

		add(chicken);
		add(tank);
		add(bullet);
		chickenTh = new ChickenThread(chicken);
		chickenTh.start();

		setFocusable(true);
		requestFocus();

		addKeyListener(new KeyAdapter() {
			BulletThread bulletTh = null;

			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					if (bulletTh == null || !bulletTh.isAlive()) {
						bulletTh = new BulletThread(bullet, chicken,chickenTh);
						bulletTh.start();
					}
				}
			}
		});
	}
}

public class Ex05 extends JFrame {
	public Ex05() {
		setTitle("사격 게임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setContentPane(new gamePanel());

		setSize(500, 500);
		setResizable(false);
		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex05();
	}
}
