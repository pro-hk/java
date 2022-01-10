package lecture;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

class MyDialog extends JDialog {
	private JTextField tf = new JTextField(10);
	private JButton btn = new JButton("ok");
	
	public MyDialog(JFrame frame, String title) {
		super(frame,title); // super�� �θ������ ȣ��.. ������ ���� ���� ��� �Ѵ�.
		setLayout(new FlowLayout());

		add(tf);
		add(btn);
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				tf.setText("");
				setVisible(false);
			}
		});
		
		setSize(200,200);
	}
	public String getInputText() {
		return tf.getText();
	}
}

public class DialogTest extends JFrame {  // �˾�â..
	private MyDialog dialog;
	
	public DialogTest() {
		setTitle("DialogTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		
		JButton btnDialog = new JButton("Show Dialog");
		
		dialog = new MyDialog(this,"Dialog�Դϴ�");
		
		btnDialog.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);
				String txt = dialog.getInputText();
				btnDialog.setText(txt);
			}
		});
		
		contentPane.add(btnDialog);
		
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new DialogTest();
	}
}
