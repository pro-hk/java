package lecture;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calculator extends JFrame {
	public Calculator() {
		setTitle("°è»ê±â");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new GridLayout(2,0));
		
		JLabel result = new JLabel();
		result.setFont(new Font("Arial",Font.BOLD,40));
		JPanel keyboard = new JPanel();
		keyboard.setLayout(new GridLayout(4,4,5,5));
		
		
		String text[] = {"C","¡À","¡¿","=","7","8","9","+","4","5","6","-","1","2","3","0"} ;
		for(int i=0; i<text.length;i++) {
			JButton numi = new JButton(text[i]);
			numi.setSize(100, 100);
			numi.setOpaque(true);
			numi.setForeground(Color.white);
			numi.setFont(new Font("Arial",Font.BOLD,20));
			if(i==0) {
				numi.setBackground(Color.red);
			} else if(i<4 || i==7 || i==11) {
				numi.setBackground(Color.gray);
			} else {
				numi.setBackground(Color.black);
			}
			keyboard.add(numi);
			if(i==0) {
				numi.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						result.setText("");
					}
				});
			} else if(i==3) {
				numi.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						String txt = result.getText();
						char last = txt.charAt(txt.length()-1);
						if(last=='¡¿' || last == '¡À' || last=='+' || last=='-') {
							result.setText("ERROR");
						} else {
							double Result;
							if(txt.contains("+")){
								int plus = txt.indexOf("+");
								Result = Double.parseDouble(txt.substring(0, plus))+Double.parseDouble(txt.substring(plus+1,txt.length()));
								result.setText(""+Result);
							} else if(txt.contains("-")) {
								int subtract = txt.indexOf("-");
								Result = Double.parseDouble(txt.substring(0, subtract))-Double.parseDouble(txt.substring(subtract+1,txt.length()));
								result.setText(""+Result);
							} else if(txt.contains("¡À")) {
								int divide = txt.indexOf("¡À");
								Result = Double.parseDouble(txt.substring(0, divide))/Double.parseDouble(txt.substring(divide+1,txt.length()));
								result.setText(""+Result);
							} else if(txt.contains("¡¿")) {
								int multiple = txt.indexOf("¡¿");
								Result = Double.parseDouble(txt.substring(0, multiple))*Double.parseDouble(txt.substring(multiple+1,txt.length()));
								result.setText(""+Result);
							}
						}
					}
				});
			} else if(i==1 || i==2 || i==7 || i==11) {
				numi.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						String txt = result.getText();
						String rest = txt.substring(0, txt.length()-1);
						char last = txt.charAt(txt.length()-1);
						if(last=='¡¿' || last == '¡À' || last=='+' || last=='-') {
							last = numi.getText().toCharArray()[0];
							result.setText(rest + last);
						} else {
							result.setText(txt + numi.getText());
						}
					}
				});
			} else {
				numi.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						String txt = result.getText();
						result.setText(txt + numi.getText());
					}
				});
			}
		}
		
		setSize(500, 700);
		setVisible(true);
		
		contentPane.add(result);
		contentPane.add(keyboard);
	}
	
	public static void main(String[] args) {
		new Calculator();
	}
}
