package practice;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OpenChallenge extends JFrame {
	public OpenChallenge() {
		setSize(500, 300);
		setVisible(true);
		setTitle("OpenChallenge");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		GamePanel gamePanel = new GamePanel();
		setContentPane(gamePanel);

	}

	class GamePanel extends JPanel {
		private JLabel result = new JLabel("시작합니다.");
		private JLabel labelList[] = new JLabel[3];
		public GamePanel() {
			setLayout(null);
			for (int i = 0; i < labelList.length; i++) {
				labelList[i] = new JLabel("0");
				labelList[i].setSize(100, 50);
				labelList[i].setOpaque(true);
				labelList[i].setBackground(Color.magenta);
				labelList[i].setForeground(Color.yellow);
				labelList[i].setLocation(90 + 110 * i, 80);
				labelList[i].setFont(new Font("Comic Sans MS", Font.BOLD, 36));
				labelList[i].setHorizontalAlignment(JLabel.CENTER);
				this.add(labelList[i]);
			}
			result.setSize(200, 50);
			result.setLocation(150, 200);
			result.setHorizontalAlignment(JLabel.CENTER); // 가운데 정렬
			add(result);
			addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e) {
					if (e.getKeyCode() == KeyEvent.VK_ENTER) {
						int random01 = (int)(Math.random()*10);
						int random02 = (int)(Math.random()*10);
						int random03 = (int)(Math.random()*10);
						labelList[0].setText(""+random01);
						labelList[1].setText(""+random02);
						labelList[2].setText(Integer.toString(random03));
						if(random01 == random02 && random02 == random03) {
							result.setText("축하합니다!!");
						} else {
							result.setText("아쉽군요");
						}
					}
				}
			});
			this.setFocusable(true);
			this.requestFocus();
		}
	}

	public static void main(String[] args) {
		new OpenChallenge();
	}
}
