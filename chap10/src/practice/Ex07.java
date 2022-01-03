package practice;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex07 extends JFrame {
	private JLabel label = new JLabel("Love Java"); 
	public Ex07() {
		setSize(300, 300);
		setVisible(true);
		setTitle("마우스 휠을 굴려 폰트 크기 조절");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		contentPane.addMouseWheelListener(new Wheel());
		contentPane.setFocusable(true);
		contentPane.requestFocus();
		
		label.setFont(new Font("Arial",Font.PLAIN,10));
		
		contentPane.add(label);
	}
	
	class Wheel implements MouseWheelListener{

		@Override
		public void mouseWheelMoved(MouseWheelEvent e) {
			Font f = label.getFont();
			int size = f.getSize();
			if(e.getWheelRotation() > 0) {
				label.setFont(new Font("Arial",Font.PLAIN,size+5));
			} else if(e.getWheelRotation() < 0 && size>5 ) {
				label.setFont(new Font("Arial",Font.PLAIN,size-5));
			}
		}
		
	}
	
	public static void main(String[] args) {
		new Ex07();
	}
}
