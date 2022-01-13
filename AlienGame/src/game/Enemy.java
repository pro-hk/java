package game;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Enemy {
		public Image image;
		public int x;
		public int y;
		public int width;
		public int heigth;
		public int speedY = 5;
		public int hp = 30;
		public int score = 0;
		public int loadX;
		public int radius;
		public double t = 0;
		public double speedT = 0;
		public int damage = 10;
		
		public Enemy(int x, int y, int hp, String enemyImage) {
			this.x = x;
			this.y = y;
			this.hp = hp;
			this.loadX = x;
			this.radius = (int)(Math.random()*50+50);   // 회전 반경
			this.speedT = Math.random()*0.05 + 0.01;   // 회전 주기(클수록 빨리 돌아옴)
			this.image = new ImageIcon("images/"+enemyImage+".png").getImage();
			this.width = image.getWidth(null);
			this.heigth = image.getHeight(null);
			this.speedY = (int)(Math.random()*10+5);
		}
		
		public void moveDown() {
			y += speedY;
			x = (int)(Math.cos(t)*radius) + loadX;
			t += speedT;
		}
}
