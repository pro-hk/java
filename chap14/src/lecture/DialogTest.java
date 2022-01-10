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
		super(frame,title); // super는 부모생성자 호출.. 무조건 제일 위에 써야 한다.
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

public class DialogTest extends JFrame {  // 팝업창..
	private MyDialog dialog;
	
	public DialogTest() {
		setTitle("DialogTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		
		JButton btnDialog = new JButton("Show Dialog");
		
		dialog = new MyDialog(this,"Dialog입니다");
		
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
