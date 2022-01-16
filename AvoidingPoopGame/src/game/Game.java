package game;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;

public class Game extends Thread {
	private Player player = new Player(150-32, 500-32);
	public boolean isLeft = false;
	public boolean isRight = false;
	private Poop poop;
	private ArrayList<Poop> poopList = new ArrayList<>();
	private int count = 0;
	private int poopDelay = 7;
	private int point = 0;
	private boolean isOver = false;

	public Game() {
		start();
	}

	public void run() {
		while (true) {
			try {
				sleep(20);
			} catch (InterruptedException e) {
				return;
			}
			keyProcess();
			makePoop();
			poopProcess();
			count++;
		}
	}

	private void keyProcess() {
		if (isLeft && player.getX() > 0) {
			player.moveLeft();
		} else if (isRight && player.getX() < 300-32) {
			player.moveRight();
		} else {
			player.moveStand();
		}
	}
	
	private void makePoop() {
		if(count % poopDelay == 0) {
			int randomX = (int)(Math.random()*(300-32));
			poop = new Poop(randomX, -32);
			poopList.add(poop);
		}
	}
	
	private void poopProcess() {
		for(int i=0; i<poopList.size(); i++) {
			poop = poopList.get(i);
			poop.moveDown();
			if(intersects(
					new Rectangle(player.getX()+10,player.getY(),player.getWidth()-20,player.getHeight()),
					new Rectangle(poop.getX(),poop.getY(),poop.getWidth(),poop.getHeigth())
			)) {
				isOver = true;
				interrupt();
			}
			if(poop.getY() > 500-32) {
				poopList.remove(poop);
				point ++;
			}
			
		}
	}
	
	public boolean getIsOver() {
		return isOver;
	}
	
	public int getPoint() {
		return point;
	}
	
	private boolean intersects(Rectangle rect01, Rectangle rect02) {
		return rect01.intersects(rect02);
	}

	public void drawPlayer(Graphics g) {
		g.drawImage(player.getImage(), player.getX(), 500 - 32, null);
		g.drawString("현재 점수 : " + point, 100, 30);
	}
	
	public void drawPoop(Graphics g) {
		for(int i=0; i<poopList.size(); i++) {
			poop = poopList.get(i);
			g.drawImage(poop.getImage(), poop.getX(), poop.getY(), null);
		}
	}
}
