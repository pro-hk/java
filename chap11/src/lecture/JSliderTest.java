package lecture;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSliderTest extends JFrame {
	private JSlider sliderList[] = new JSlider[3];
	private JLabel colorLabel = new JLabel("SLIDER CHANGE BG");
	JLabel resultLabel = new JLabel("(128,128,128)");
	public JSliderTest() {
		setTitle("TextListAppend 테스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout());

		for (int i = 0; i < sliderList.length; i++) {
			sliderList[i] = new JSlider(JSlider.HORIZONTAL, 0, 255, 128);
			sliderList[i].setPaintLabels(true); // 숫자..
			sliderList[i].setPaintTicks(true); // 눈금..
			sliderList[i].setMajorTickSpacing(50); // 큰 구간 범위
			sliderList[i].setMinorTickSpacing(10); // 작은 구간 범위
			contentPane.add(sliderList[i]);
			sliderList[i].addChangeListener(new ChangeListener() {
				@Override
				public void stateChanged(ChangeEvent e) {
//					System.out.println(slider.getValue());
					int r = sliderList[0].getValue();
					int g = sliderList[1].getValue();
					int b = sliderList[2].getValue();
					colorLabel.setBackground(new Color(r,g,b));
					resultLabel.setText("("+r+","+g+","+b+")");
				}
			});
		}
		colorLabel.setOpaque(true);
		colorLabel.setBackground(new Color(128,128,128));
		colorLabel.setForeground(Color.white);
		
		
		contentPane.add(colorLabel);
		contentPane.add(resultLabel);

		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JSliderTest();
	}
}
