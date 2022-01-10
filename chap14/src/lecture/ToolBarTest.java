package lecture;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.ToolTipManager;

public class ToolBarTest extends JFrame {
	private Container contentPane;
	public ToolBarTest() {
		setTitle("ToolBarTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		createToolbar();
		
		setSize(300,300);
		setVisible(true);
	}
	
	private void createToolbar() {
		JToolBar toolBar = new JToolBar("toolbar");
		toolBar.setBackground(Color.lightGray);
		JButton btnNew = new JButton("new");
		btnNew.setToolTipText("Create new file");  // 하단에 내용 설명
		toolBar.add(btnNew);
		toolBar.addSeparator();
		JButton btnOpen = new JButton(new ImageIcon("images/frame.png"));
		btnOpen.setToolTipText("Open file");
		toolBar.add(btnOpen);
		toolBar.add(new JButton(new ImageIcon("images/save.png")));
		toolBar.add(new JLabel("Search"));
		JTextField tf = new JTextField("Write Text");
		tf.setToolTipText("찾고자 하는 문자를 입력하세요");
		toolBar.add(tf);
		JComboBox combo = new JComboBox();
		combo.addItem("Java");
		combo.addItem("C++");
		combo.addItem("Phythom");
		combo.addItem("Javascript");
		toolBar.add(combo);
		
		ToolTipManager manager = ToolTipManager.sharedInstance();
		manager.setInitialDelay(100);
		manager.setDismissDelay(2000);
		
		contentPane.add(toolBar,BorderLayout.NORTH);
	}

	public static void main(String[] args) {
		new ToolBarTest();
	}
}
