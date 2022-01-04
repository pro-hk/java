package lecture;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class FruitsRadio extends JFrame {
	private JLabel sumLabel;
	private ArrayList<JRadioButton> fruits = new ArrayList<>();
	private ArrayList<ImageIcon> images = new ArrayList<>();
	private JLabel imageLabel = new JLabel();
	
	public FruitsRadio() {
		setTitle("라디오 테스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		JPanel radioPanel = new JPanel();
		
		ImageIcon appleIcon = new ImageIcon("images/apple.png");
		ImageIcon cherryIcon = new ImageIcon("images/cherry.png");
		ImageIcon lemonIcon = new ImageIcon("images/lemons.png");
		
		images.add(appleIcon);
		images.add(cherryIcon);
		images.add(lemonIcon);
		
		JRadioButton apple = new JRadioButton("사과");
		JRadioButton cherry = new JRadioButton("체리");
		JRadioButton lemon = new JRadioButton("레몬");
		
		radioPanel.add(apple);
		radioPanel.add(cherry);
		radioPanel.add(lemon);
		
		ButtonGroup radioGroup = new ButtonGroup();
		radioGroup.add(apple);
		radioGroup.add(cherry);
		radioGroup.add(lemon);
		// 하나만 선택됨
		
		contentPane.add(radioPanel,BorderLayout.NORTH);
		contentPane.add(imageLabel,BorderLayout.CENTER);
		
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		imageLabel.setIcon(images.get(0));
		
		fruits.add(apple);
		fruits.add(cherry);
		fruits.add(lemon);
		
		setSize(250, 300);
		setVisible(true);
		
		MyItemListner listener = new MyItemListner();
		
		for(int i=0;i<fruits.size();i++) {
			JRadioButton radio = fruits.get(i);
			radio.addItemListener(listener);
		}
		
	}
	
	class MyItemListner implements ItemListener{
		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange()==ItemEvent.SELECTED) {
				if(fruits.get(0).isSelected()) imageLabel.setIcon(images.get(0));
				else if (fruits.get(1).isSelected()) imageLabel.setIcon(images.get(1));
				else if (fruits.get(2).isSelected()) imageLabel.setIcon(images.get(2));
			} else {
				
			}
		}
	}
	
	public static void main(String[] args) {
		new FruitsRadio();
	}
}
