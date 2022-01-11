package practice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class OpenChallenge extends JFrame {
	private int cup = 0;
	private int coffee = 0;
	private int water = 0;
	private int sugar = 0;
	private int cream = 0;
	private CenterPanel centerPanel = new CenterPanel();
	private JLabel imgLabel;

	public OpenChallenge() {
		setTitle("커피자판기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		add(new TopPanel(), BorderLayout.NORTH);
		add(centerPanel, BorderLayout.CENTER);
		add(new BottomPanel(), BorderLayout.SOUTH);

		setSize(500, 500);
		setVisible(true);
	}

	class TopPanel extends JPanel {
		public TopPanel() {
			add(new JLabel("Welcome, Hot Coffee !!"));

			setOpaque(true);
			setBackground(Color.magenta);
			setSize(500, 100);
		}
	}

	class BottomPanel extends JPanel {
		private JButton btns[] = new JButton[4];
		private String coffeeLists[] = {"Black Coffee","Sugar Coffee","Dabang Coffee","Reset"};
		
		public BottomPanel() {
			setLayout(new FlowLayout());

			for(int i=0;i<4;i++) {
				btns[i] = new JButton(coffeeLists[i]);
				add(btns[i]);
				btns[i].addActionListener(new MyActionListener());
//				btns[i].addActionListener(new ActionListener() {
//					@Override
//					public void actionPerformed(ActionEvent e) {
//						centerPanel.makingCoffee(e.getActionCommand());
//					}
//				});
			}
		}
	}
	
	class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(cup>=150) {
				JOptionPane.showMessageDialog(null, "부족한 것이 있습니다.채워주세요.","커피 자판기 경고",JOptionPane.ERROR_MESSAGE);
				return;
			} else {
				switch(e.getActionCommand()) {
				case "Black Coffee" :  
					cup += 10;
					coffee += 10;
					water += 10;
					break;
				case "Sugar Coffee" : 
					cup += 10;
					coffee += 10;
					water += 10;
					sugar += 10;
					break;
				case "Dabang Coffee" :
					cup += 10;
					coffee += 10;
					water += 10;
					sugar += 10;
					cream += 10;
					break;
				case "Reset" : 
					cup = 0;
					coffee = 0;
					water = 0;
					sugar = 0;
					cream = 0;
					centerPanel.repaint();
					return;
				}
			}
			centerPanel.repaint();
			imgLabel.setVisible(true);
			JOptionPane.showMessageDialog(null, "뜨거워요, 즐거운 하루~~","커피나왔습니다.",JOptionPane.INFORMATION_MESSAGE);
			imgLabel.setVisible(false);
		}
	}
	 
	class CenterPanel extends JPanel {
		private JLabel coffeeLabels[] = new JLabel[5];
		private String coffeeLists[] = { "Cup", "Coffee", "Water", "Sugar", "Cream" };

		public CenterPanel() {
			setLayout(null);

			for (int i = 0; i < coffeeLabels.length; i++) {
				coffeeLabels[i] = new JLabel(coffeeLists[i]);
				coffeeLabels[i].setLocation(20 + 100 * i, 210);
				coffeeLabels[i].setSize(50, 30);
				add(coffeeLabels[i]);
			}
			
			imgLabel = new JLabel();
			imgLabel.setIcon(new ImageIcon("images/coffee.png"));
			imgLabel.setLocation(220, 220);
			imgLabel.setSize(150,150);
			imgLabel.setVisible(false);
			
			add(imgLabel);
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			for(int i=0;i<5;i++) {
				g.setColor(Color.gray);
				g.fillRect(20+100*i, 50, 50, 150);
				g.setColor(Color.darkGray);
				g.drawRect(19+100*i, 49, 51, 151);
			}
			g.setColor(Color.white);
			g.fillRect(20, 50, 50, cup);
			g.fillRect(120, 50, 50, coffee);
			g.fillRect(220, 50, 50, water);
			g.fillRect(320, 50, 50, sugar);
			g.fillRect(420, 50, 50, cream);
		}
//		public void makingCoffee(String command) {
//			System.out.println(command);
//		}
	}

	public static void main(String[] args) {
		new OpenChallenge();
	}
}
