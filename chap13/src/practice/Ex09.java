package practice;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ex09 extends JFrame {
	public Ex09() {
		setTitle("스레드를 가진 겜블링");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(new GamePanel());
		
		setSize(500,500);
		setResizable(false);
		pack();
		setVisible(true);
	}
	
	class GamePanel extends JPanel {
		private JLabel labels[] = new JLabel[3];
		private JLabel resultLabel = new JLabel("마우스를 클릭할 때 마다 게임합니다."); 
		private GameThread gameTh = new GameThread(labels, resultLabel);
		
		public GamePanel() {
			setPreferredSize(new Dimension(500,300));
			setLayout(null);
			for(int i=0;i<labels.length;i++) {
				labels[i] = new JLabel("0");
				labels[i].setFont(new Font("맑은 고딕",Font.BOLD,48));
				labels[i].setHorizontalAlignment(JLabel.CENTER);
				labels[i].setOpaque(true);
				labels[i].setBackground(Color.magenta);
				labels[i].setForeground(Color.yellow);
				labels[i].setSize(100,70);
				labels[i].setLocation(110*i+90, 100);
				add(labels[i]);
			}
			resultLabel.setSize(500,50);
			resultLabel.setHorizontalAlignment(JLabel.CENTER);
			resultLabel.setFont(new Font("맑은 고딕",Font.BOLD,24));
			resultLabel.setLocation(0, 200);
			add(resultLabel);
			gameTh.start();
			
			addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					gameTh.gameStart();
				}
			});
		}
	}
	
	class GameThread extends Thread {
		private JLabel labels[];
		private JLabel resultLabel; 
		private boolean isStart = false;
		
		public GameThread(JLabel labels[], JLabel resultLabel){
			this.labels = labels;
			this.resultLabel = resultLabel;
		}
		
		synchronized public void gameWait() {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		synchronized public void gameStart() {
			notify();
		}
		
		public void run() {
			while(true) {
				gameWait();
				try {
					sleep(200);
					int num01 = (int)(Math.random()*100);
					int num02 = (int)(Math.random()*100);
					int num03 = (int)(Math.random()*100);
					labels[0].setText(Integer.toString(num01));
					sleep(200);
					labels[1].setText(Integer.toString(num02));
					sleep(200);
					labels[2].setText(Integer.toString(num03));
					if(num01 == num02 && num02 == num03) resultLabel.setText("축하합니다.");
					else resultLabel.setText("아쉽군요");
				} catch (InterruptedException e) {
					return;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new Ex09();
	}
}
