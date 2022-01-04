package lecture;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;



public class MouseAdapterTest extends JFrame {
	private JLabel label = new JLabel("HELLO");
	
	public MouseAdapterTest() {
		setTitle("MouseEventListenerTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = this.getContentPane();
		contentPane.setLayout(null);
		
		contentPane.addMouseListener(new MyMouseAdapterListener());
		contentPane.add(label);
		label.setSize(50,30);

		setSize(500, 500);
		setVisible(true);
	}
	class MyMouseAdapterListener extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			label.setLocation(x, y);
		}
	}
	public static void main(String[] args) {
		new MouseAdapterTest();
	}
}
