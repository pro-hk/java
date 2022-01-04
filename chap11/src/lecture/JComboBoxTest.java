package lecture;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JComboBoxTest extends JFrame {
	private String fruits[] = {"apple","cherry","lemon","banana","strawberry","kiwi","orange","peach"};
	private String animals[] = {"lion","tiger","rabbit","horse"};
	private ImageIcon animalIcon[] = {
			new ImageIcon("images/lion.png"),
			new ImageIcon("images/tiger.png"),
			new ImageIcon("images/rabbit.png"),
			new ImageIcon("images/horse.png")
	};
	public JComboBoxTest() {
		setTitle("TextListAppend Å×½ºÆ®");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JComboBox<String> comboBox = new JComboBox<>(fruits);
		JComboBox<String> animalComboBox = new JComboBox<>();
		for(int i=0; i<animals.length;i++) {
			animalComboBox.addItem(animals[i]);
		}
		
		contentPane.add(comboBox);
		
		JLabel imageLabel = new JLabel();
		contentPane.add(imageLabel);
		imageLabel.setIcon(animalIcon[0]);
		
		contentPane.add(animalComboBox);
		animalComboBox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox)e.getSource();
//				System.out.println(cb.getSelectedIndex());
				int sel = cb.getSelectedIndex();
				imageLabel.setIcon(animalIcon[sel]);
			}
		});
		
		setSize(280, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JComboBoxTest();
	}
}
