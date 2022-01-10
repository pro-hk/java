package lecture;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileDialogTest extends JFrame {
	private JLabel imgLabel = new JLabel();
	
	public FileDialogTest() {
		setTitle("FileDialogTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.add(imgLabel);
		CreateMenu();
		
		setSize(500,300);
		setVisible(true);
	}
	
	private void CreateMenu() {
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenuItem openItem = new JMenuItem("Open");
		
		openItem.addActionListener(new OpenActionListener());
		
		fileMenu.add(openItem);
		menuBar.add(fileMenu);
		
		setJMenuBar(menuBar);
	}
	
	class OpenActionListener implements ActionListener {
		private JFileChooser fileChooser;
		
		public OpenActionListener() {
			fileChooser = new JFileChooser();
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			FileNameExtensionFilter filter = 
					new FileNameExtensionFilter("images", "jpg","gif","png","jpeg");
			fileChooser.setFileFilter(filter);
			fileChooser.showOpenDialog(null);
			String filePath = fileChooser.getSelectedFile().getPath();
			imgLabel.setIcon(new ImageIcon(filePath));
		}
		
	}

	public static void main(String[] args) {
		new FileDialogTest();
	}
}
