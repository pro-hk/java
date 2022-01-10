package practice;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Ex02 extends JFrame {
	private ImagePanel imgPanel = new ImagePanel();
	
	public Ex02() {
		setTitle("메뉴로 배경 이미지 로딩하기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.add(imgPanel);
		
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("파일");
		JMenuItem open = new JMenuItem("열기");
		
		open.addActionListener(new OpenActionListener());
		
		menuBar.add(fileMenu);
		fileMenu.add(open);
		
		setJMenuBar(menuBar);
		
		setSize(300,300);
		setVisible(true);
	}
	
	class OpenActionListener implements ActionListener {
		private JFileChooser fileChooser;
		
		public OpenActionListener() {
			fileChooser = new JFileChooser();
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			fileChooser.showOpenDialog(null);
			String filePath = fileChooser.getSelectedFile().getPath();
			ImageIcon imgIcon = new ImageIcon(filePath);
			Image img = imgIcon.getImage();
			imgPanel.setDrawImage(img);
		}
	}
	
	class ImagePanel extends JPanel {
		private Image img = null;
		
		public void setDrawImage(Image img) {
			this.img = img;
			repaint();
		}
		
		public void paintComponent(Graphics g) {
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
		}
	}
	
	public static void main(String[] args) {
		new Ex02();
	}
}
