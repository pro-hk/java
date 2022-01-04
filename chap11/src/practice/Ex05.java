package practice;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ex05 extends JFrame {
	public Ex05() {
		setTitle("Jslider Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JSlider slider = new JSlider(100,200,150);
		slider.setMajorTickSpacing(20);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		
		JLabel label = new JLabel(Integer.toString(slider.getValue()));
		label.setOpaque(true);
		label.setBackground(Color.green);
		label.setForeground(Color.white);
		
		slider.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				label.setText(Integer.toString(slider.getValue()));
			}
		});
		
		contentPane.add(slider);
		contentPane.add(label);
		
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex05();
	}
}
