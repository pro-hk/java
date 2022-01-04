package lecture;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class JListAppend extends JFrame {
	private JTextField tf = new JTextField(20);
	private Vector<String> vec = new Vector<>();
	private JList<String> list = new JList<>(vec);
	public JListAppend() {
		setTitle("TextListAppend �׽�Ʈ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JLabel("���ڸ� �Է� �� Enter�� ��������"));
		contentPane.add(tf);
		contentPane.add(new JScrollPane(list,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER));
				// ��ũ�ѹ� ���� ����..
		
		tf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tf = (JTextField)(e.getSource());
				vec.add(tf.getText());
				tf.setText("");
				list.setListData(vec);
			}
		});
		vec.add("�强ȣ");
		vec.add("�̼���");
		setSize(280, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JListAppend();
	}
}
