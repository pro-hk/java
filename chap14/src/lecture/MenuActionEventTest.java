package lecture;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuActionEventTest extends JFrame {
	private JLabel imgLabel = new JLabel();
	
	public MenuActionEventTest() {
		setTitle("메뉴바&사진불러오기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		contentPane.add(imgLabel,BorderLayout.CENTER);
		
		createMenu();
		
		setSize(300,300);
		setVisible(true);
	}
	
	private void createMenu() {
		JMenuBar menuBar = new JMenuBar();
		JMenuItem menuItems[] = new JMenuItem[4];
		String itemTitles[] = {"Load","Hide","Reshow","Exit"};
		JMenu screenMenu = new JMenu("Screen");
		MenuActionListener menuListener = new MenuActionListener();
		for(int i=0; i<itemTitles.length;i++) {
			menuItems[i] = new JMenuItem(itemTitles[i]);
			menuItems[i].addActionListener(menuListener);
			screenMenu.add(menuItems[i]);
		}
		
		setJMenuBar(menuBar);
		menuBar.add(screenMenu);
	}
	
	class MenuActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
//			System.out.println(e.getActionCommand());
			String command = e.getActionCommand();
			switch(command) {
			case "Load" : 
				imgLabel.setIcon(new ImageIcon("images/nature.jpeg"));
			break;
			case "Hide" : 
				imgLabel.setVisible(false);
				break;
			case "Reshow" : 
				imgLabel.setVisible(true);
				break;
			case "Exit" : 
				System.exit(0);
				break;
			}
		}
	}

	public static void main(String[] args) {
		new MenuActionEventTest();
	}
}
