package practice;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Ex01 extends JFrame {
	public Ex01() {
		setTitle("�޴� �����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("����");
		JMenu editorMenu = new JMenu("����");
		JMenu viewMenu = new JMenu("����");
		JMenu inputMenu = new JMenu("�Է�");
		
		JMenuItem screen = new JMenuItem("ȭ��Ȯ��");
		JMenuItem page = new JMenuItem("������");
		
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
