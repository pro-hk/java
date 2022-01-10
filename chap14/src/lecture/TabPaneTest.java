package lecture;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TabPaneTest extends JFrame {
	public TabPaneTest() {
		setTitle("TabPaneTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = getContentPane();
		JTabbedPane tabs = createTabbedPane();
		
		contentPane.add(tabs,BorderLayout.CENTER);
		

		setSize(500, 300);
		setVisible(true);
	}
	
	private JTabbedPane createTabbedPane() {
		JTabbedPane tabs = new JTabbedPane(JTabbedPane.TOP);
		tabs.addTab("tab01", new JLabel(new ImageIcon("images/durian.png")));
		tabs.addTab("tab02", new JLabel(new ImageIcon("images/dragon_fruit.png")));
		tabs.addTab("tab03", new MyPanel());
		return tabs;
	}
	
	class MyPanel extends JPanel {
		public MyPanel(){
			setBackground(Color.yellow);
		}
		
		public void paintComponent(Graphics g) {
			g.setColor(Color.red);
			g.fillRect(30, 30, 150, 150);
			g.setColor(Color.blue);
			g.fillOval(100, 100, 100, 100);
			g.setColor(Color.green);
			g.drawString("Hello Java", 30, 50);
		}
	}

	public static void main(String[] args) {
		new TabPaneTest();
	}
}
