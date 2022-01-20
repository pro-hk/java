package game;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Poop {
	private Image image = new ImageIcon("images/poo.png").getImage();
	private int x;
	private int y;
	private int width = image.getWidth(null);
	private int height = image.getHeight(null);
	
	public Poop(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	public void moveDown(int speedY) {
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
	
	public Image getImage() {
		return image;
	}
}
