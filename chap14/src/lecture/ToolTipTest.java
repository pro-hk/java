package lecture;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ToolTipManager;

public class ToolTipTest extends JFrame {
	// JLabel�� ���� �̹��� 2�� �÷��� tooltip �����.. 3�� �� ����� 
	public ToolTipTest() {
		setTitle("ToolTipTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JLabel durian = new JLabel(new ImageIcon("images/durian.png"));
		JLabel dragon = new JLabel(new ImageIcon("images/dragon_fruit.png"));
		durian.setToolTipText("�θ���");
		dragon.setToolTipText("���");
		
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
