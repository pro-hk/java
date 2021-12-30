package lecture;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FirstFrame extends JFrame {
	public FirstFrame() {
		setSize(300, 300);   // 사이즈 결정
		setVisible(true);   // 화면에 표시
		this.setTitle("my first frame");  // 타이틀 달기
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기 누르면 꺼짐
		// 기본세팅
		Container contentPane = this.getContentPane();  // JFrame 생성시 만들어지는 기본 패널 가져오기
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());   // 배치관리자
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("CLICK"));
	}
	public static void main(String[] args) {
		FirstFrame myFrame = new FirstFrame();
	}
}
