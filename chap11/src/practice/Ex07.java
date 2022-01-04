package practice;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ex07 extends JFrame {
	public Ex07() {
		setTitle("JSlider Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		JLabel label = new JLabel("I Love Java");
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setFont(new Font("Arial",Font.PLAIN,20));
		
		JSlider slider = new JSlider(1,100,20);
		slider.setMajorTickSpacing(20);
		slider.setMinorTickSpacing(5);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		
		slider.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				label.setFont(new Font("Arial",Font.PLAIN,slider.getValue()));
			}
		});
		
		contentPane.add(label,BorderLayout.CENTER);
		contentPane.add(slider,BorderLayout.NORTH);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex07();
	}
}
