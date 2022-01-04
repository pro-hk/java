package practice;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex07 extends JFrame {
	public Ex07() {
		setSize(500, 500);
		setVisible(true);
		setTitle("마우스 휠을 굴려 폰트 크기 조절");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Love Java");
		label.setFont(new Font("Arial",Font.PLAIN,10));
		
		contentPane.addMouseWheelListener(new MouseWheelListener() {
			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				int n = e.getWheelRotation();
				Font f = label.getFont();
				int size = f.getSize();
				if(n<0 && size > 5) {
					label.setFont(new Font("Arial",Font.PLAIN,size-5));
				}
				else if(n>0) {
					label.setFont(new Font("Arial",Font.PLAIN,size+5));
				}
			}
		});
		contentPane.add(label);
	}
	public static void main(String[] args) {
		new Ex07();
	}
}
