package lecture;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseAllTest extends JFrame {
	private JLabel label = new JLabel("hello");

	public MouseAllTest() {
		setTitle("상하좌우 키를 눌러서 이동");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = this.getContentPane();
		
		MyMouseListener myMouseListener = new MyMouseListener();
		
		contentPane.addMouseListener(myMouseListener);
		contentPane.addMouseMotionListener(myMouseListener);
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(label);
		
		setSize(300, 300);
		setVisible(true);
		contentPane.setFocusable(true);
		contentPane.requestFocus();
	}
	// 자바는 다중 상속 안됨.. interface 로 흉내내기는 가능
	class MyMouseListener implements MouseListener, MouseMotionListener {
		@Override
		public void mouseDragged(MouseEvent e) {
			label.setText("dragged ("+e.getX()+","+e.getY()+")");
		}
		@Override
		public void mouseMoved(MouseEvent e) {
			label.setText("moved ("+e.getX()+","+e.getY()+")");
		}
		@Override
		public void mouseClicked(MouseEvent e) {
			System.out.println(e.getClickCount());
			Container contentPane = (Container)e.getSource();
			if(e.getClickCount()==2) {
				int r = (int)(Math.random()*256);
				int g = (int)(Math.random()*256);
				int b = (int)(Math.random()*256);
				contentPane.setBackground(new Color(r,g,b));
			}
		}
		@Override
		public void mousePressed(MouseEvent e) {
			label.setText("pressed ("+e.getX()+","+e.getY()+")");
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			label.setText("released ("+e.getX()+","+e.getY()+")");
		}
		@Override
		public void mouseEntered(MouseEvent e) {
//			System.out.println(e.getSource());  -- object 리턴
			Container contentPane = (Container)e.getSource();
			contentPane.setBackground(Color.yellow);
		}
		@Override
		public void mouseExited(MouseEvent e) {
			Container contentPane = (Container)e.getSource();
			contentPane.setBackground(Color.orange);
		}
	}
	
	public static void main(String[] args) {
		new MouseAllTest();
	}
}
