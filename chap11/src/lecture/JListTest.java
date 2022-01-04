package lecture;

import java.awt.Container;
import java.awt.FlowLayout;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class JListTest extends JFrame {
	private String fruits[] = {
			"apple","cherry","lemon","kiwi","banana","peach",
			"apple","cherry","lemon","kiwi","banana","peach"
			};
	private ImageIcon images[] = {
			new ImageIcon("images/apple.png"),
			new ImageIcon("images/cherry.png"),
			new ImageIcon("images/lemons.png")
	};
	public JListTest() {
		setTitle("List 테스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JList<String> list01 = new JList<>(fruits);  // 배열을 받을 수 있음, 클릭가능
		contentPane.add(list01);
		
		JList<ImageIcon> list02 = new JList<>(images);  // 배열을 받을 수 있음, 클릭가능
		contentPane.add(list02);
		
		JList<String> list03 = new JList<>(fruits);  // 배열을 받을 수 있음, 클릭가능
		JScrollPane scrollList = new JScrollPane(list03);
		//scrollList.setPreferredSize(new Dimension(70,150));  // 크기 지정
		contentPane.add(scrollList);
		
		Vector<String> vec = new Vector<>();
		vec.add("test01");
		vec.add("test02");
		vec.add("test03");
		vec.add("test04");
		vec.add("test05");
		vec.add("test06");
		vec.add("test07");
		
		JList<String> list04 = new JList<>(vec); 
		contentPane.add(list04);
		
		vec.add("test08");
		vec.add("test09");
//		list04.setListData(vec); 예전에 동적으로 되지 않아 추가한 방법
		
		setSize(280, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JListTest();
	}
}
