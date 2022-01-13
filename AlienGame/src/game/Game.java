package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Game extends Thread {
	public int threadDelay = 20; // 전체 화면 렌더링 속도.. 0.02s --
	public Player player = new Player(600, 700, 100); // player 생성
	public boolean isLeft = false;
	public boolean isRight = false;
	public boolean isUp = false;
	public boolean isDown = false;
	public boolean isShoot = false;
	private int maxhp = 100;
	private int count = 0;
	private int bulletDelay = 5;
	private int enemyDelay = 10;
	
	public Boom boom;
	private ArrayList<Boom> boomList = new ArrayList<>();

	private Image endingImage = new ImageIcon("images/ending_page.jpg").getImage();
	private Image gameImage = new ImageIcon("images/game_page.jpg").getImage();

	public ArrayList<PlayerBullet> playerBulletList = new ArrayList<>();
	// space 누르면 총알 생성 -> playerBulletList에 넣기
	public PlayerBullet playerBullet;
	public int playerBulletDamage = 10;

	public ArrayList<Enemy> enemyList = new ArrayList<>();
	public Enemy enemy;
	private String enemyImageList[] = { "ufo01", "ufo02", "ufo03" };
	public int deathEnemyX;
	public int deathEnemyY;

	public Heart heart;
	public ArrayList<Heart> heartList = new ArrayList<>();
	public Speed speed;
	public ArrayList<Speed> speedList = new ArrayList<>();
	public int randomItem;
	public boolean isEnemyDeath = false;
	
	public boolean isOver = false;

	public Game() {
		isOver = false;
		playerBulletList.clear();
		enemyList.clear();
		count = 0;
		start(); // thread 시작
	}

	@Override
	public void run() {
		while (true) {
			try {
				sleep(threadDelay);
			} catch (InterruptedException e) {
				return;
			}
			// 움직임 제어 - 키를 누르면 플레이어 움직이기
			count++;
			keyProcess();
			playerBulletProcess();
			makeEnemy();
			enemyProcess();
			ItemProcess();
			boomProcess();
		}
	}
	
	public void boomProcess() {
		for(int i=0; i < boomList.size(); i++) {
			boom = boomList.get(i);
			boom.explosion();
			if(boom.count>10) {
				boomList.remove(boom);
			}
		}
	}

	public void makeItem(int x, int y, int num) {
		if (num == 0) {
			heart = new Heart(x, y, 10);
			heartList.add(heart);
		}
		if (num == 1) {
			speed = new Speed(x, y);
			speedList.add(speed);
		}
	}

	public void ItemProcess() {
		for (int i = 0; i < heartList.size(); i++) {
			heart = heartList.get(i);
			heart.moveDown();
			if (intersects(
					new Rectangle(player.x, player.y, player.width, player.height),
					new Rectangle(heart.x, heart.y, heart.width, heart.height)
			)) {
				heartList.remove(heart);
				if (player.hp < maxhp) player.hp += heart.hp;
			};
			if (heart.y > 800 + 64) {
				heartList.remove(heart);
			}
		}
		for (int i = 0; i < speedList.size(); i++) {
			speed = speedList.get(i);
			speed.moveDown();
			if (intersects(
					new Rectangle(player.x, player.y, player.width, player.height),
					new Rectangle(speed.x, speed.y, speed.width, speed.height)
					)) {
				speedList.remove(speed);
				if(bulletDelay>2) bulletDelay -= 0.2;
			};
			if (speed.y > 800 + 64) {
				speedList.remove(speed);
			}
		}
	}

	public void makeEnemy() {
		if (count % enemyDelay == 0) {
			String enemyImage = enemyImageList[(int) (Math.random() * 3)];
			int randomX = (int) (Math.random() * 800 + 200);
			enemy = new Enemy(randomX, -64, 30, enemyImage);
			enemyList.add(enemy);
		}
	}

	public void enemyProcess() {
		for (int i = 0; i < enemyList.size(); i++) {
			enemy = enemyList.get(i);
			enemy.moveDown();
			if (intersects(
					new Rectangle(player.x, player.y, player.width, player.height),
					new Rectangle(enemy.x, enemy.y, enemy.width, enemy.heigth)
			)) {
				enemyList.remove(enemy);
				player.hp -= enemy.damage;
				if (player.hp <= 0) {
					isOver = true;
					interrupt(); // Thread 종료
				}
			}
			if (enemy.y > 800 + 64) {
				enemyList.remove(enemy);
			}
		}
	}

	public void keyProcess() {
		if (isLeft && player.x > 0)
			player.moveLeft();
		if (isRight && player.x < 1200 - player.width)
			player.moveRight();
		if (isUp && player.y > 0)
			player.moveUp();
		if (isDown && player.y < 800 - player.height)
			player.moveDown();
		if (isShoot && count % bulletDelay == 0) {
			playerBullet = new PlayerBullet(player.x + 27, player.y - 17, playerBulletDamage);
			playerBulletList.add(playerBullet);
		}
	}

	public void playerBulletProcess() {
		for (int i = 0; i < playerBulletList.size(); i++) {
			playerBullet = playerBulletList.get(i);
			playerBullet.shoot();
			for (int j = 0; j < enemyList.size(); j++) {
				enemy = enemyList.get(j);
				if (intersects(
						new Rectangle(playerBullet.x, playerBullet.y, playerBullet.width, playerBullet.height),
						new Rectangle(enemy.x, enemy.y, enemy.width, enemy.heigth)
				)) {
					playerBulletList.remove(playerBullet);
					enemy.hp -= playerBullet.damage;
				}
				if (enemy.hp <= 0) {
					randomItem = (int) (Math.random() * 10);
					makeItem(enemy.x, enemy.y, randomItem);
					enemyList.remove(enemy);
					boom = new Boom(enemy.x,enemy.y);
					boomList.add(boom);
				}
			}
			if (playerBullet.y < -17)
				playerBulletList.remove(playerBullet);
		}
	}

	public boolean intersects(Rectangle rect01, Rectangle rect02) {
		return rect01.intersects(rect02);
	}

	public void drawPlayer(Graphics g) {
		// 비행기 그리기.. (Player)
		g.drawImage(player.image, player.x, player.y, null);
	}

	public void drawPlayerBullet(Graphics g) {
		for (int i = 0; i < playerBulletList.size(); i++) {
			playerBullet = playerBulletList.get(i);
			g.drawImage(playerBullet.image, playerBullet.x, playerBullet.y, null);
		}
	}

	public void drawEnemy(Graphics g) {
		for (int i = 0; i < enemyList.size(); i++) {
			enemy = enemyList.get(i);
			g.drawImage(enemy.image, enemy.x, enemy.y, null);
			for (int j = 0; j < heartList.size(); j++) {
					heart = heartList.get(j);
					g.drawImage(heart.image, heart.x, heart.y, null);
				}
			for (int j = 0; j < speedList.size(); j++) {
					speed = speedList.get(j);
					g.drawImage(speed.image, speed.x, speed.y, null);
				}
		}
	}

	public void drawInfo(Graphics g) {
		g.setFont(new Font("Arial", Font.BOLD, 24));
		g.setColor(Color.white);
		g.drawString("PLAYER HP : " + player.hp, 30, 30);
		g.fillRect(250, 17, 300, 10);
		g.setColor(Color.red);
		g.fillRect(250, 17, 300 * player.hp / maxhp, 10);
		for (int i = 0; i < enemyList.size(); i++) {
			enemy = enemyList.get(i);
			g.setFont(new Font("Arial", Font.BOLD, 18));
			g.setColor(Color.white);
			g.drawString(Integer.toString(enemy.hp), enemy.x + enemy.width / 2 - 9, enemy.y - 18);
			g.fillRect(enemy.x, enemy.y - 10, enemy.width, 4);
			g.setColor(Color.red);
			g.fillRect(enemy.x, enemy.y - 10, enemy.width * enemy.hp / 30, 4);
		}
	}

	public void drawEnding(Graphics g) {
		g.drawImage(endingImage, 0, 0, null);
	}

	public void drawGaming(Graphics g) {
		g.drawImage(gameImage, 0, 0, null);
	}
	
	public void drawBoom(Graphics g) {
		for(int i=0; i<boomList.size();i++) {
			boom = boomList.get(i);
			g.drawImage(boom.image, boom.x, boom.y, null);
		}
	}

	public void drawAll(Graphics g) {
		if (isOver)
			drawEnding(g);
		else {
			drawGaming(g);
			drawPlayer(g);
			drawPlayerBullet(g);
			drawEnemy(g);
			drawInfo(g);
			drawBoom(g);
		}
	}
}
