package game;

import javax.swing.JFrame;

public class GameMain extends JFrame {
	public GameMain() {
		setTitle("Alien Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//GamePanel �� contentPane���� ��ü
		GamePanel gamePanel = new GamePanel();
		setContentPane(gamePanel);
		
		setLocationRelativeTo(null);  // ȭ�� �߾ӿ� ����
		setResizable(false);
		pack();  // ũ�⸦ �ڽ����� ����
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new GameMain();
	}
}
