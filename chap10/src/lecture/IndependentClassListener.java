package lecture;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyActionListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println(e);
		JButton btn = (JButton)e.getSource();
//		System.out.println(btn.getX());
		if(btn.getText().equals("CLICK")) btn.setText("Ŭ��");
		else btn.setText("CLICK");
	}
}

public class IndependentClassListener extends JFrame {
	public IndependentClassListener() {
		setTitle("�������� Ŭ������ �����ϴ� �̺�Ʈ ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JButton btn01 = new JButton("CLICK");
		JButton btn02 = new JButton("CLOSE");
		JButton btn03 = new JButton("OPEN");
		
		btn01.addActionListener(new MyActionListener());
		btn02.addActionListener(new MyActionListener());
		btn03.addActionListener(new MyActionListener());
		
		contentPane.add(btn01);
		contentPane.add(btn02);
		contentPane.add(btn03);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new IndependentClassListener();
	}
}
