package game;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Speed {
	public Image image;
	public int width;
	public int height;
	public int x;
	public int y;
	public int speedY = 15;
	public int num;

	public Speed(int x, int y) {
		this.x = x;
		this.y = y;
		image = new ImageIcon("images/speed.png").getImage();
		width = image.getWidth(null);
		height = image.getHeight(null);
	}

	public void moveDown() {
		y += speedY;
	}
}
