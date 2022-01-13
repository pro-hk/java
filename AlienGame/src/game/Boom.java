package game;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Boom {
	public Image image = new ImageIcon("images/bubble-chat.png").getImage();
	public int x;
	public int y;
	public int width = image.getWidth(null);
	public int height = image.getHeight(null);
	public int count = 0;
	
	public Boom(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void explosion() {
		count++;
	}
}
