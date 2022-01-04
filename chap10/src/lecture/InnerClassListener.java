package lecture;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class InnerClassListener extends JFrame {
	public InnerClassListener() {
		setTitle("�������� Ŭ������ �����ϴ� �̺�Ʈ ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JButton btn01 = new JButton("CLICK");
		JButton btn02 = new JButton("CLOSE");
		JButton btn03 = new JButton("OPEN");
		
		btn01.addActionListener(new MyInnerListener());
//		btn02.addActionListener(new MyInnerListener());
//		btn03.addActionListener(new MyInnerListener());
		
		contentPane.add(btn01);
		contentPane.add(btn02);
		contentPane.add(btn03);
		
		setSize(300, 300);
		setVisible(true);
		}
	private class MyInnerListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
//				System.out.println(e);
			JButton btn = (JButton) e.getSource();
//				System.out.println(btn.getX());
			if (btn.getText().equals("CLICK")) btn.setText("Ŭ��");
			else btn.setText("CLICK");
			InnerClassListener.this.setTitle("���� �̳� Ŭ������ �ۼ��� �̺�Ʈ �����ʿ� ���� �ٲ�� �����Դϴ�.");
		}
	}

	public static void main(String[] args) {
		new InnerClassListener();
	}
}
