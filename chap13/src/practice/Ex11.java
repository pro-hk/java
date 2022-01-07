package practice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Ex11 extends JFrame {
	GamePanel gamePanel;
	InputPanel inputPanel;
	
	public Ex11() {
		setTitle("떨어지는 단어 맞추기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		gamePanel = new GamePanel();
		inputPanel = new InputPanel(gamePanel);
		
		contentPane.add(gamePanel,BorderLayout.NORTH);
		contentPane.add(inputPanel,BorderLayout.SOUTH);
		
		
		setSize(500,500);
		setResizable(false);
		pack();
		setVisible(true);
	}
	
	class GamePanel extends JPanel {	
		private JLabel resultLabel = new JLabel();
		private JLabel wordLabel = new JLabel();
		private Words words;
		private WordsThread wordTh;
		
		public GamePanel() {
			setPreferredSize(new Dimension(400,500));
			setOpaque(true);
			setBackground(Color.lightGray);
			setLayout(null);
			
			resultLabel.setLocation(10, 10);
			resultLabel.setSize(300,30);
			resultLabel.setForeground(Color.white);
			resultLabel.setFont(new Font("맑은 고딕",Font.BOLD,20));
			add(resultLabel);
			
			words = new Words();
			wordLabel.setText(words.getRandomWord());
			wordLabel.setSize(150,40);
			wordLabel.setLocation(250, -50);
			wordLabel.setForeground(Color.magenta);
			wordLabel.setFont(new Font("맑은 고딕", Font.ITALIC,20));
			add(wordLabel);
			
			wordTh = new WordsThread(this, resultLabel);
			wordTh.start();
		}
		
		public void printResult(String txt) {
			resultLabel.setText(txt);
		}
		
		public void gameStop() {
			if(wordTh==null) return;
			wordTh.interrupt();
		}
		
		public void gameStart() {
			wordLabel.setText(words.getRandomWord());
			wordLabel.setSize(200,40);
			wordLabel.setLocation(250, -50);
			wordLabel.setForeground(Color.magenta);
			wordLabel.setFont(new Font("맑은 고딕", Font.ITALIC,20));
			
			wordTh = new WordsThread(this, resultLabel);
			wordTh.start();
		}
		
		public boolean matchWord(String txt) {
			if(wordLabel.getText().equals(txt)) return true;
			return false;
		}
		
		class Words {
			private Vector<String> wordVector = new Vector<>();
			
			public Words() {
				try {
					// 1. words.txt 파일 읽기
					Scanner scanner = new Scanner(new FileReader("src/words.txt"));
					// 2. Vector에 담기
					while(scanner.hasNext()) {
						wordVector.add(scanner.nextLine());
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			}
			// 3. 무작위로 글자 뽑기
			public String getRandomWord() {
				int total = wordVector.size();
				String selectedWord = wordVector.get((int)(Math.random()*total));
				return selectedWord;
			}
		}
	
		class WordsThread extends Thread {
			private GamePanel gamePanel;
			private JLabel resultLabel;
			
			public WordsThread(GamePanel gamePanel, JLabel resultLabel ){
				this.gamePanel = gamePanel;
				this.resultLabel = resultLabel;
			}
			
			public void run() {
				while(true) {
					try {
						sleep(10);
						int y = wordLabel.getY() + 1;
						wordLabel.setLocation(wordLabel.getX(), y);
						if(y >= gamePanel.getHeight()-40) {
							gamePanel.printResult("시간초과실패");
							gamePanel.gameStop();
							gamePanel.gameStart();
						}
						repaint();
					} catch (InterruptedException e) {
						return;
					}
				}
			}
		}
		
	}
	
	class InputPanel extends JPanel {
		private JTextField input = new JTextField();
		private GamePanel gamePanel;
		
		public InputPanel(GamePanel gamePanel) {
			this.gamePanel = gamePanel;
			setPreferredSize(new Dimension(500,50));
			setOpaque(true);
			setBackground(Color.gray);
			setLayout(null);
			
			add(input);
			input.setSize(new Dimension(300,30));
			input.setLocation(100, 10);
			input.setBorder(BorderFactory.createEmptyBorder(5,10,5,10));  // 테두리 없앰(숫자는 padding - 시계 반대방향)
			input.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String txt = input.getText();
					if(txt.equals("그만")) System.exit(0);
					input.setText("");
					if(gamePanel.matchWord(txt)) {
						gamePanel.printResult("성공");
						gamePanel.gameStop();
						gamePanel.gameStart();
					} else {
						gamePanel.printResult("Try Again");
					}
				}
			});
		}
	}
	
	public static void main(String[] args) {
		new Ex11();
	}
}
