package lecture;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JCheckBoxTest extends JFrame {
	private JLabel sumLabel;
	private ArrayList fruits = new ArrayList();
	
	public JCheckBoxTest() {
		setTitle("체크박스 테스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		ImageIcon lemonIcon = new ImageIcon("images/lemons.png");
		ImageIcon cherryIcon = new ImageIcon("images/cherry.png");
		ImageIcon appleIcon = new ImageIcon("images/apple.png");
		/*
		JCheckBox apple = new JCheckBox("사과");
		JCheckBox cherry = new JCheckBox("체리",true);
		JCheckBox lemon = new JCheckBox("레몬",lemonIcon);
		*/
		
		JCheckBox lemon = new JCheckBox(lemonIcon);
		JCheckBox cherry = new JCheckBox(cherryIcon);
		JCheckBox apple = new JCheckBox(appleIcon);
		
		contentPane.add(new JLabel("사과 : 5,000 / 체리 : 7000 / 레몬 : 3000"));

//		contentPane.add(apple);
//		contentPane.add(cherry);
//		contentPane.add(lemon);
		
		fruits.add(apple);
		fruits.add(cherry);
		fruits.add(lemon);
		MyItemListener listener = new MyItemListener();
		
		for(int i=0; i<fruits.size();i++) {
//			System.out.println(fruits.get(i));
			JCheckBox checkBox = (JCheckBox)fruits.get(i);
			contentPane.add(checkBox);
			checkBox.setBorderPainted(true);
			checkBox.addItemListener(listener);
		}
		
		sumLabel = new JLabel("==== PRICE : 0 ====");

		contentPane.add(sumLabel);
		
		setSize(250, 300);
		setVisible(true);
	}
	
	class MyItemListener implements ItemListener{
		private int sum = 0;
		@Override
		public void itemStateChanged(ItemEvent e) {
//			System.out.println(e.getStateChange());
			// 누르면 1, 떼면 2
			if(e.getStateChange()==ItemEvent.SELECTED) {
//				System.out.println(e.getItem());
				if(e.getItem()==fruits.get(0)) sum+=5000;  //System.out.println("나는 사과");
				else if (e.getItem()==fruits.get(1)) sum+=7000; //System.out.println("나는 체리");
				else sum+=3000;   //System.out.println("나는 레몬");
			}
			else {
				if(e.getItem()==fruits.get(0)) sum-=5000;  
				else if (e.getItem()==fruits.get(1)) sum-=7000; 
				else sum-=3000; 
			}
			sumLabel.setText("==== PRICE : "+sum+" ====");
		}
	}
	
	public static void main(String[] args) {
		new JCheckBoxTest();
	}
}
