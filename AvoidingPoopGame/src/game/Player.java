package game;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Player {
	public Image image = new ImageIcon("images/player.png").getImage();
	private int x;
	private int y;
	private int width = image.getWidth(null);
	private int height = image.getHeight(null);
	private int speedX = 10;
	
	public Player(int x){
		image = new ImageIcon("images/player.png").getImage();
		this.x = x;
		y = 600-64;
	}
	
	public void moveLeft() {
		x -= speedX;
		image = new ImageIcon("images/player-left.png").getImage();
	}
	public void moveRight() {
		x += speedX;
		image = new ImageIcon("images/player-right.png").getImage();
	}
	
	public int getX() {
		return x;
	}
	
//	public void changeImage(String direction) {
//		image = new ImageIcon("images/player-"+direction+".png").getImage();
//	}
}
