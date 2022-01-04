package practice;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ex09 extends JFrame {
	private JButton btns[] = new JButton[3];
	private ImageIcon images[] = {
			new ImageIcon("images/rock.png"),
			new ImageIcon("images/scissors.png"),
			new ImageIcon("images/paper.png")
	};
	public Ex09() {
		setTitle("가위 바위 보 게임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		JPanel choicePanel = new JPanel();
		choicePanel.setLayout(new FlowLayout());
		choicePanel.setOpaque(true);
		choicePanel.setBackground(Color.gray);
		
		for(int i=0;i<btns.length;i++) {
			btns[i] = new JButton(images[i]);
			choicePanel.add(btns[i]);
		}
		
		JPanel selectedPanel = new JPanel();
		selectedPanel.setOpaque(true);
		selectedPanel.setBackground(Color.yellow);
		selectedPanel.setLayout(new FlowLayout());
		
		JLabel meLabel = new JLabel();
		JLabel comLabel = new JLabel();
		
		selectedPanel.add(meLabel);
		selectedPanel.add(new JLabel("me"));
		selectedPanel.add(comLabel);
		selectedPanel.add(new JLabel("com"));
		
		
		contentPane.add(choicePanel,BorderLayout.NORTH);
		contentPane.add(selectedPanel,BorderLayout.CENTER);
		
		setSize(1200,1000);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex09();
	}
}
