package game;

import javax.swing.JFrame;

public class GameMain extends JFrame {
	GameMain(){
		setTitle("¶ËÇÇÇÏ±â");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GamePanel gamePanel = new GamePanel();
		setContentPane(gamePanel);
		
		pack();
		setResizable(false);
		setVisible(true);
	}
	public static void main(String[] args) {
		new GameMain();
	}
}
