package game;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Player {  
	// ����ڰ� ����� ����� �̹��� / x, y ��ǥ���� / width, height ũ�⼳�� / speedX, speedY �̵��ӵ� / HP, SCORE, ShootDelay
	public Image image = new ImageIcon("images/space-ship.png").getImage();
	public int x;
	public int y;
	public int width = image.getWidth(null);
	public int height = image.getHeight(null);
	public int speedX = 20;
	public int speedY = 20;
	public int hp = 100;
	public int score = 0;
	public int shootDelay = 5;
	
	public Player(int x, int y, int hp) {
		this.x = x;
		this.y = y;
		this.hp = hp;
	}
	
	public void moveLeft() {
		x -= speedX;
	}
	public void moveRight() {
		x += speedX;
	}
	public void moveUp() {
		y -= speedY;
	}
	public void moveDown() {
		y += speedY;
	}
}
