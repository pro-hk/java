package lecture;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JComponentTest extends JFrame {
	public JComponentTest() {
		setTitle("컴퍼넌트 메서드 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JButton btn01 = new JButton("Magenta / Yellow");
		JButton btn02 = new JButton("disable");
		JButton btn03 = new JButton("getX() / getY()");
		
		contentPane.add(btn01);
		contentPane.add(btn02);
		contentPane.add(btn03);
		
		btn01.setBackground(Color.magenta);
		btn01.setForeground(Color.yellow);
		btn01.setFont(new Font("Arial",Font.BOLD,24));
		
		btn02.setEnabled(false);
		btn03.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton)e.getSource();
				JComponentTest frame = (JComponentTest) btn.getTopLevelAncestor();
				frame.setTitle(btn.getX()+" / "+btn.getY());
			}
		});
		
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JComponentTest();
	}
}
