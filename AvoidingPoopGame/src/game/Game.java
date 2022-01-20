package game;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Game extends Thread {
	private Player player = new Player(150-32, 500-32);
	public boolean isLeft = false;
	public boolean isRight = false;
	private Poop poop;
	private ArrayList<Poop> poopList = new ArrayList<>();
	private int count = 0;
	private int poopDelay = 10;
	private int maxPoint = 0;
	private int point = 0;
	private boolean isOver = false;
	private int speed = 3;

	public Game() {
		try {
			FileInputStream input = new FileInputStream("src/maxPoint.txt");
			maxPoint = input.read();
			input.close();
		} catch (IOException e) {
		}
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
		} else if (isRight && player.getX() < 300-player.getWidth()) {
			player.moveRight();
		} else {
			player.moveStand();
		}
	}
	
	private void makePoop() {
		poopDelay = 10 - count/1000;
		if(count % poopDelay == 0) {
			int randomX = (int)(Math.random()*(300-player.getWidth()));
			poop = new Poop(randomX, -player.getHeight());
			poopList.add(poop);
		}
	}
	
	private void poopProcess() {
		for(int i=0; i<poopList.size(); i++) {
			poop = poopList.get(i);
			speed = 3 + count/1500;
			poop.moveDown((int)(Math.random()*5+speed));
			if(intersects(
					new Rectangle(player.getX()+10,player.getY(),player.getWidth()-20,player.getHeight()),
					new Rectangle(poop.getX(),poop.getY(),poop.getWidth(),poop.getHeigth())
			)) {
				isOver = true;
				try {
					FileOutputStream output = new FileOutputStream("src/maxPoint.txt");
					output.write(maxPoint);
					output.close();
				} catch (IOException e) {
				}
				interrupt();
			}
			if(poop.getY() > 500-32) {
				poopList.remove(poop);
				point ++;
				if(maxPoint<point) maxPoint = point;
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
		g.drawString("최고 점수 : " + maxPoint, 100, 30);
		g.drawString("현재 점수 : " + point, 100, 40);
	}
	
	public void drawPoop(Graphics g) {
		for(int i=0; i<poopList.size(); i++) {
			poop = poopList.get(i);
			g.drawImage(poop.getImage(), poop.getX(), poop.getY(), null);
		}
	}
}
