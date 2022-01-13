package game;

import java.awt.Graphics;

public class Game extends Thread {
	private Player player = new Player(200-32);
	public boolean isLeft = false;
	
	public Game(){
		start();
	}
	
	public void run() {
		keyProcess();
	}
	
	public void keyProcess() {
		if(isLeft) {
			System.out.println("isleft true");
			player.moveLeft();
		}
	}
	
	public void drawPlayer(Graphics g) {
		g.drawImage(player.image, player.getX(), 600-64, null);
	}
}
