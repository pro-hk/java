package lecture;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class OptionPanelTest extends JFrame {
	public OptionPanelTest() {
		setTitle("OptionPanelTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.add(new BtnPanel(),BorderLayout.NORTH);
		
		setSize(500,300);
		setVisible(true);
	}
	
	class BtnPanel extends JPanel {
		private JButton btnInput = new JButton("Input Name");
		private JButton btnConfirm = new JButton("Confirm");
		private JButton btnMsg = new JButton("Message");
		private JTextField tf = new JTextField(10);
		
		public BtnPanel() {
			setBackground(Color.gray);
			setLayout(new FlowLayout());
			add(btnInput);
			add(btnConfirm);
			add(btnMsg);
			add(tf);
			
			btnInput.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String name = JOptionPane.showInputDialog("이름을 입력하세요");
					if(name==null) return;
					tf.setText(name);
				}
			});
			btnConfirm.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					int result = JOptionPane.showConfirmDialog(null, "계속 할건가요?", "Confirm",JOptionPane.YES_NO_OPTION);
					// showConfirmDialog(null, 내용, 창제목, 버튼선택)
					if(result==JOptionPane.CLOSED_OPTION) tf.setText("Closed no select");
					else if(result == JOptionPane.YES_OPTION) tf.setText("Yes");
					else tf.setText("No");
				}
			});
			btnMsg.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "Red Alert", "Message",JOptionPane.ERROR_MESSAGE);
					// showMessageDialog(null, 내용, 창제목, 버튼선택)
				}
			});
		}
	}
	
	public static void main(String[] args) {
		new OptionPanelTest();
	}
}
