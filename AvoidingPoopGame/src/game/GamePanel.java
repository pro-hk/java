package game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class GamePanel extends JPanel {
	private Game game;
	private Player player;
	
	public GamePanel() {
		setPreferredSize(new Dimension(400,600));
		setOpaque(true);
		setBackground(Color.white);
		setLayout(null);
		gameInit();
	}
	
	public void gameInit() {
		game = new Game();
		setFocusable(true);
		requestFocus();
		addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				
			}
			@Override
			public void keyPressed(KeyEvent e) {
				switch(e.getKeyCode()) {
				case KeyEvent.VK_LEFT :
					game.isLeft = true;
					System.out.println("true");
					break;
				case KeyEvent.VK_ESCAPE :
					System.exit(0);
				}
			}
		});
	}
	
	public void paintComponent(Graphics g) {
		screenCapture(g);
	}
	
	public void screenCapture(Graphics g) {
		game.drawPlayer(g);
		repaint();
	}
}
