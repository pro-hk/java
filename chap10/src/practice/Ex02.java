package practice;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class Ex02 extends JFrame {
	public Ex02() {
		setTitle("µå·¡±ëµ¿¾È YELLOW");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = this.getContentPane();
		contentPane.setBackground(Color.green);
		MyMouse mymouse = new MyMouse();
		
		contentPane.addMouseMotionListener(mymouse);
		contentPane.addMouseListener(mymouse);

		setSize(300, 300);
		setVisible(true);
	}

	class MyMouse implements MouseMotionListener, MouseListener {
	/*
	class MyMouseListener extends MouseAdapter {
		public void mouseDragged(MouseEvent e) {
			Container contentPane = (Container)e.getSource();
			contentPane.setBackground(Color.yellow);
		}
		public void mouseReleased(MouseEvent e) {
			Container contentPane = (Container)e.getSource();
			contentPane.setBackground(Color.green);
		}
	}
	 */
		
		@Override
		public void mouseDragged(MouseEvent e) {
			Container contentPane = (Container)e.getSource();
			contentPane.setBackground(Color.yellow);
		}
		@Override
		public void mouseMoved(MouseEvent e) {}
		@Override
		public void mouseClicked(MouseEvent e) {}
		@Override
		public void mousePressed(MouseEvent e) {}
		@Override
		public void mouseReleased(MouseEvent e) {
			Container contentPane = (Container)e.getSource();
			contentPane.setBackground(Color.green);
		}
		@Override
		public void mouseEntered(MouseEvent e) {}
		@Override
		public void mouseExited(MouseEvent e) {}
	}

	public static void main(String[] args) {
		new Ex02();
	}

}
