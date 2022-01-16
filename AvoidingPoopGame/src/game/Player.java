package game;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Player {
	private Image image = new ImageIcon("images/player.png").getImage();
	private int x;
	private int y;
	private int width = image.getWidth(null);
	private int height = image.getHeight(null);
	private int speedX = 7;
	
	public Player(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void moveLeft() {
		x -= speedX;
		image = new ImageIcon("images/player-left.png").getImage();
	}
	public void moveRight() {
		x += speedX;
		image = new ImageIcon("images/player-right.png").getImage();
	}
	public void moveStand() {
		image = new ImageIcon("images/player.png").getImage();
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public Image getImage() {
		return image;
	}

}
