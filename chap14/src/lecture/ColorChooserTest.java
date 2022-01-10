package lecture;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class ColorChooserTest extends JFrame {
	private JLabel label = new JLabel("Hello Java");

	public ColorChooserTest() {
		setTitle("ColorChooserTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = getContentPane();
		contentPane.add(label,BorderLayout.CENTER);
		
		label.setFont(new Font("Juice ITC",Font.BOLD,48));
		label.setHorizontalAlignment(JLabel.CENTER);
		
		CreateMenu();

		setSize(500, 300);
		setVisible(true);
	}

	private void CreateMenu() {
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("Text");
		JMenuItem colorItem = new JMenuItem("Color");

		colorItem.addActionListener(new ColorActionListener());

		fileMenu.add(colorItem);
		menuBar.add(fileMenu);

		setJMenuBar(menuBar);
	}
	
	class ColorActionListener implements ActionListener  {
		@Override
		public void actionPerformed(ActionEvent e) {
			Color selectedColor = JColorChooser.showDialog(null, "Color", Color.yellow);
			label.setForeground(selectedColor);
		}
		
	}

	public static void main(String[] args) {
		new ColorChooserTest();
	}
}
