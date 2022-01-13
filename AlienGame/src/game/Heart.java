package game;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Heart {
	public Image image = new ImageIcon("images/heart.png").getImage();
	public int width = image.getWidth(null);
	public int height = image.getHeight(null);
	public int x;
	public int y;
	public int hp = 10;
	public int speedY = 10;
	public int num;
	public int loadX;
	public int radius;
	public double t = 0;
	public double speedT = 0;

	public Heart(int x, int y, int hp) {
		this.x = x;
		this.y = y;
		this.hp = hp;
		radius = (int)(Math.random()*100+100);
		loadX = x;
		speedT = Math.random()*0.05 + 0.01;
	}

	public void moveDown() {
		y += speedY;
		x = (int)(Math.cos(t)*radius+loadX);
		t += speedT;
	}
}
