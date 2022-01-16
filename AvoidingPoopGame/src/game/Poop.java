package game;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Poop {
	private Image image = new ImageIcon("images/poo.png").getImage();
	private int x;
	private int y;
	private int width = image.getWidth(null);
	private int height = image.getHeight(null);
	private int speed = 3;
	private int speedY = (int)(Math.random()*5+speed);
	
	public Poop(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	public void moveDown() {
		y += speedY;
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
	
	public int getHeigth() {
		return height;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public Image getImage() {
		return image;
	}
}
