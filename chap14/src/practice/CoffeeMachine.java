package practice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CoffeeMachine extends JFrame {
	CoffeePanel coffeePanel = new CoffeePanel();
	CoffeeMachine() {
		this.setTitle("Coffee Machine");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = this.getContentPane();
		contentPane.setLayout(new BorderLayout());
		contentPane.add(new TitlePanel(),BorderLayout.NORTH);
		contentPane.add(new ButtonPanel(),BorderLayout.SOUTH);
		contentPane.add(coffeePanel,BorderLayout.CENTER);
		
		this.setSize(500, 500);
		this.setVisible(true);
	}

	class TitlePanel extends JPanel {
		private JLabel title = new JLabel("Welcome Hot Coffee");
		TitlePanel() {
			this.setBackground(Color.MAGENTA);
			title.setForeground(Color.WHITE);
			title.setFont(new Font("Arial",Font.BOLD,20));
			this.add(title);
		}
	}
	class ButtonPanel extends JPanel {
		private JButton btns[] = new JButton[4];
		private String coffeeTitles[] = 
			{"Black Coffee","Sugar Coffee","Dabang Coffee","Reset"};
		ButtonPanel() {
			for(int i=0;i<4;i++) {
				btns[i] = new JButton(coffeeTitles[i]);
				this.add(btns[i]);
				btns[i].addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						//System.out.println(e.getActionCommand());
						coffeePanel.makingCoffee(e.getActionCommand());
					}
				});
			}
		}
	}
	
	class CoffeePanel extends JPanel {
		private String coffeeTitles[] = {"Cup","Coffee","Water","Sugar","Cream"};
		private CoffeeBox coffeeBoxes[] =  new CoffeeBox[5];
		private JLabel coffeeImgLabel;
		private ImageIcon coffeeIcon = new ImageIcon("images/coffee.png");
		CoffeePanel() {
			this.setLayout(null);
			for(int i=0;i<5;i++) {
				coffeeBoxes[i] = new CoffeeBox();
				coffeeBoxes[i].setLocation(i*(50+10)+100, 50);
				coffeeBoxes[i].setSize(50, 120);
				JLabel label = new JLabel(coffeeTitles[i]);
				label.setSize(50, 30);
				label.setLocation(i*(50+10)+100, 170);
				label.setHorizontalAlignment(JLabel.CENTER);
				this.add(coffeeBoxes[i]);
				this.add(label);
			}
			coffeeImgLabel = new JLabel();
			coffeeImgLabel.setLocation(
					(500-coffeeIcon.getIconWidth())/2, 220);
			coffeeImgLabel.setSize(
					coffeeIcon.getIconWidth(),coffeeIcon.getIconHeight());
			//coffeeImgLabel.setIcon(coffeeIcon);
			this.add(coffeeImgLabel);
		}
		public void makingCoffee(String command) {
			//System.out.println("커피만들기....");
			//System.out.println(command);
			if(command=="Black Coffee") {
				//System.out.println("나는 불랙 커피");
				if(coffeeBoxes[0].isEmpty() || 
				   coffeeBoxes[1].isEmpty() || 
				   coffeeBoxes[2].isEmpty()) {
					errorMessage();
					return;
				}
				coffeeBoxes[0].consume();
				coffeeBoxes[1].consume();
				coffeeBoxes[2].consume();
				
			} else if(command=="Sugar Coffee") {
				//System.out.println("나는 설탕 커피");
				if(coffeeBoxes[0].isEmpty() || 
			       coffeeBoxes[1].isEmpty() || 
				   coffeeBoxes[2].isEmpty() ||
				   coffeeBoxes[3].isEmpty()
				   ) {
					errorMessage();
					return;
				}
						
				coffeeBoxes[0].consume();
				coffeeBoxes[1].consume();
				coffeeBoxes[2].consume();
				coffeeBoxes[3].consume();
			} else if(command=="Dabang Coffee") {
				//System.out.println("나는 다방 커피");
				if(coffeeBoxes[0].isEmpty() || 
			       coffeeBoxes[1].isEmpty() || 
				   coffeeBoxes[2].isEmpty() ||
				   coffeeBoxes[3].isEmpty() ||
				   coffeeBoxes[4].isEmpty() 
						   ) {
					errorMessage();
					return;
				}
				coffeeBoxes[0].consume();
				coffeeBoxes[1].consume();
				coffeeBoxes[2].consume();
				coffeeBoxes[3].consume();
				coffeeBoxes[4].consume();
			} else {
				//System.out.println("리셋");
				coffeeBoxes[0].reset();
				coffeeBoxes[1].reset();
				coffeeBoxes[2].reset();
				coffeeBoxes[3].reset();
				coffeeBoxes[4].reset();
				repaint();
				return;
			}
			repaint();
			coffeeImgLabel.setIcon(coffeeIcon);
			infoMessage(command);
			coffeeImgLabel.setIcon(null);
			
		}
		public void infoMessage(String coffeeName) {
			JOptionPane.showMessageDialog(
					null,coffeeName+"나왔습니다.", "COFFEE",JOptionPane.INFORMATION_MESSAGE);
		}
		public void errorMessage() {
			JOptionPane.showMessageDialog(
					null,"부족한게 있습니다. 채워주세요~~", "COFFEE",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	class CoffeeBox extends JLabel {
		private double total = 3;
		private double current = total;
		CoffeeBox() {
			
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.GRAY);
			int y = 120 - (int)((current/total*120));
			g.fillRect(0, y, this.getWidth(), this.getHeight() - y);
			g.setColor(Color.BLACK);
			g.drawRect(0, 0, this.getWidth()-1, this.getHeight()-1);
		}
		public void consume() {
			current--;
		}
		public void reset() {
			current = total;
		}
		public boolean isEmpty() {
			if(current<=0) return true;
			else return false;
		}
	}
	
	
	public static void main(String[] args) {
		new CoffeeMachine();
	}
}