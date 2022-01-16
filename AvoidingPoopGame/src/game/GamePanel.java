package game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class GamePanel extends JPanel {
	private Image bufferImage;
	private Graphics screenGraphics;
	private Game game;
	private boolean isStart = false;
	
	public GamePanel() {
		setPreferredSize(new Dimension(300,500));
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
				switch(e.getKeyCode()) {
				case KeyEvent.VK_LEFT :
					game.isLeft = false;
					break;
				case KeyEvent.VK_RIGHT :
					game.isRight = false;
					break;
				}
			}
			@Override
			public void keyPressed(KeyEvent e) {
				switch(e.getKeyCode()) {
				case KeyEvent.VK_LEFT :
					game.isLeft = true;
					break;
				case KeyEvent.VK_RIGHT :
					game.isRight = true;
					break;
				case KeyEvent.VK_ENTER :
					if(!isStart) {
						game = new Game();
						isStart = true;
					}
					break;
				case KeyEvent.VK_R : 
					if(game.getIsOver()) isStart = false;
					break;
				case KeyEvent.VK_ESCAPE :
					System.exit(0);
				}
			}
		});
	}
	
	public void paintComponent(Graphics g) {
		bufferImage = createImage(getWidth(),getHeight());
		screenGraphics = bufferImage.getGraphics();
		screenCapture(screenGraphics);
		g.drawImage(bufferImage, 0, 0, null);
	}
	
	public void screenCapture(Graphics g) {
		if(!isStart) g.drawString("시작하려면 Enter를 누르세요", 70, 200);
		else if(isStart && !game.getIsOver()) {
			game.drawPlayer(g);
			game.drawPoop(g);
		} else {
			g.drawString("당신은 "+game.getPoint()+"개의 똥을 피했습니다.", 60, 200);
			g.drawString("다시 시작하려면 R키를 누르세요",60,220);
		}
		repaint();
	}
}
