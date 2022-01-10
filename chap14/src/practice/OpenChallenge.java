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
		public BottomPanel() {
			setLayout(new FlowLayout());

			JButton Black = new JButton("Black Coffee");
			JButton Sugar = new JButton("Sugar Coffee");
			JButton Dabang = new JButton("Dabang Coffee");
			JButton Reset = new JButton("Reset");
			
			Black.addActionListener(new MyActionListener());
			Sugar.addActionListener(new MyActionListener());
			Dabang.addActionListener(new MyActionListener());
			Reset.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					cup = 0;
					coffee = 0;
					water = 0;
					sugar = 0;
					cream = 0;
					centerPanel.repaint();
				}
			});

			add(Black);
			add(Sugar);
			add(Dabang);
			add(Reset);
		}
	}
	
	class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(cup>=150 || coffee>=150 || water>=150||sugar>=150||cream>=150) {
				JOptionPane.showMessageDialog(null, "부족한 것이 있습니다.채워주세요.","커피 자판기 경고",JOptionPane.ERROR_MESSAGE);
				return;
			}
			else if(e.getActionCommand().equals("Black Coffee")) {
				cup += 10;
				coffee += 10;
				water += 10;
			}
			else if(e.getActionCommand().equals("Sugar Coffee")) {
				cup += 10;
				coffee += 10;
				water += 10;
				sugar += 10;
			} else {
				cup += 10;
				coffee += 10;
				water += 10;
				sugar += 10;
				cream += 10;
			}
			imgLabel.setVisible(true);
			JOptionPane.showMessageDialog(null, "뜨거워요, 즐거운 하루~~","커피나왔습니다.",JOptionPane.ERROR_MESSAGE);
			imgLabel.setVisible(false);
			centerPanel.repaint();
		}
	}

	class CenterPanel extends JPanel {
		private JLabel labelArray[] = new JLabel[5];
		private String array[] = { "Cup", "Coffee", "Water", "Sugar", "Cream" };
		

		public CenterPanel() {
			setLayout(null);

			for (int i = 0; i < labelArray.length; i++) {
				labelArray[i] = new JLabel(array[i]);
				labelArray[i].setLocation(20 + 100 * i, 210);
				labelArray[i].setSize(50, 30);
				add(labelArray[i]);
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
			g.setColor(Color.gray);
			for(int i=0;i<5;i++) {
				g.fillRect(20+100*i, 50, 50, 150);
			}
			g.setColor(Color.white);
			g.fillRect(20, 50, 50, cup);
			g.fillRect(120, 50, 50, coffee);
			g.fillRect(220, 50, 50, water);
			g.fillRect(320, 50, 50, sugar);
			g.fillRect(420, 50, 50, cream);
		}
	}

	public static void main(String[] args) {
		new OpenChallenge();
	}
}
