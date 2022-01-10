package lecture;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ToolTipManager;

public class ToolTipTest extends JFrame {
	// JLabel에 과일 이미지 2개 올려서 tooltip 생기게.. 3초 뒤 사라짐 
	public ToolTipTest() {
		setTitle("ToolTipTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JLabel durian = new JLabel(new ImageIcon("images/durian.png"));
		JLabel dragon = new JLabel(new ImageIcon("images/dragon_fruit.png"));
		durian.setToolTipText("두리안");
		dragon.setToolTipText("용과");
		
		ToolTipManager manager = ToolTipManager.sharedInstance();
		manager.setInitialDelay(100);
		manager.setDismissDelay(3000);
		
		contentPane.add(durian);
		contentPane.add(dragon);
		
		setSize(300,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ToolTipTest();
	}
}
