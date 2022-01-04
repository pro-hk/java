package lecture;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AnonymousClassListener extends JFrame {
	public AnonymousClassListener() {
		setTitle("�������� Ŭ������ �����ϴ� �̺�Ʈ ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JButton btn01 = new JButton("CLICK");
		JButton btn02 = new JButton("CLOSE");
		JButton btn03 = new JButton("OPEN");
		
		btn01.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton)e.getSource();
				if(btn.getText().equals("CLICK")) btn.setText("Ŭ��");
				else btn.setText("CLICK");
				setTitle("���� �͸� Ŭ������ ������� �����ʿ��� �θ� Ŭ������ Ÿ��Ʋ�� �ٲٰ� �ֽ��ϴ�.");
			}
		});
//		btn02.addActionListener(new MyActionListener());
//		btn03.addActionListener(new MyActionListener());
		
		contentPane.add(btn01);
		contentPane.add(btn02);
		contentPane.add(btn03);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new AnonymousClassListener();
	}
}
