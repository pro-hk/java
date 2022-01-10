package practice;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Ex01 extends JFrame {
	public Ex01() {
		setTitle("메뉴 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("파일");
		JMenu editorMenu = new JMenu("편집");
		JMenu viewMenu = new JMenu("보기");
		JMenu inputMenu = new JMenu("입력");
		
		JMenuItem screen = new JMenuItem("화면확대");
		JMenuItem page = new JMenuItem("쪽윤곽");
		
		viewMenu.add(screen);
		viewMenu.add(page);
		
		menuBar.add(fileMenu);
		menuBar.add(editorMenu);
		menuBar.add(viewMenu);
		menuBar.add(inputMenu);
		
		setJMenuBar(menuBar);
		
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex01();
	}
}
