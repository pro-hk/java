package practice;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ex06 extends JFrame {
	public Ex06() {
		setTitle("TextArea Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		JTextArea ta = new JTextArea(5,10);
		JSlider slider = new JSlider(0,100,0);
		slider.setMajorTickSpacing(20);
		slider.setMinorTickSpacing(5);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		
		
		ta.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				int total = ta.getText().length();
				if(total>100) {
					ta.setText(ta.getText().substring(0, 100));
					return;
				}
				slider.setValue(total);
			}
		});
		
		slider.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				int total = ta.getText().length();
				int val = slider.getValue();
				if(total > val) ta.setText(ta.getText().substring(0, val));
			}
		});
		
		contentPane.add(new JScrollPane(ta),BorderLayout.NORTH);
		contentPane.add(slider,BorderLayout.CENTER);

		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex06();
	}
}
