package practice;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;

public class Ex03 extends JFrame {
	public Ex03() {
		setTitle("툴바");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JToolBar toolBar = new JToolBar("toolbar");
		JButton btnExit = new JButton("종료");
		
		btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "정말 종료하시겠습니까?","종료창",JOptionPane.YES_NO_OPTION);
				if(result==JOptionPane.YES_OPTION) System.exit(0);
				else return;
			}
		});
		
		toolBar.add(btnExit);
		add(toolBar,BorderLayout.NORTH);
		
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex03();
	}
}
