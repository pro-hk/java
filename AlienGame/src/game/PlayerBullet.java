package game;

import java.awt.Image;

import javax.swing.ImageIcon;

public class PlayerBullet {
	public Image image = new ImageIcon("images/bullet01.png").getImage();
	public int x;
	public int y;
	public int width = image.getWidth(null);
	public int height = image.getHeight(null);
	public int speedY = 10;
	public int damage = 10;
	
	public PlayerBullet(int x, int y, int damage) {
		this.x = x;
		this.y = y;
		this.damage = damage;
	}
	
	public void shoot() {
		y-=speedY;
	}
}
