package game;

import javax.swing.JFrame;

public class GameMain extends JFrame {
	public GameMain() {
		setTitle("Alien Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//GamePanel 을 contentPane으로 대체
		GamePanel gamePanel = new GamePanel();
		setContentPane(gamePanel);
		
		setLocationRelativeTo(null);  // 화면 중앙에 띄우기
		setResizable(false);
		pack();  // 크기를 자식한테 맞춤
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new GameMain();
	}
}
