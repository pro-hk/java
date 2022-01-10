package lecture;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuTest extends JFrame {
	public MenuTest() {
		setTitle("메뉴바 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		createMenu();
		
		setSize(300,300);
		setVisible(true);
	}
	
	private void createMenu() {
		JMenuBar menuBar = new JMenuBar();
		JMenu screenMenu = new JMenu("Screen");
		screenMenu.add(new JMenuItem("Load"));
		screenMenu.add(new JMenuItem("Hide"));
		screenMenu.add(new JMenuItem("Reshow"));
		screenMenu.addSeparator();
		screenMenu.add(new JMenuItem("Exit"));
		
		menuBar.add(screenMenu);
		menuBar.add(new JMenu("Edit"));
		menuBar.add(new JMenu("Source"));
		menuBar.add(new JMenu("Project"));
		menuBar.add(new JMenu("Run"));
		
		setJMenuBar(menuBar);
	}

	public static void main(String[] args) {
		new MenuTest();
	}
}
