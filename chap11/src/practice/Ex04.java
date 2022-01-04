package practice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ex04 extends JFrame {
	private String moneyTitles[] = {"오만원","만원","오천원","천원","500원","100원","50원","10원","1원"};
	private int units[] = {50000,10000,5000,1000,500,100,50,10,1};
	private JTextField tfList[] = new JTextField[9];
	private JCheckBox cbList[] = new JCheckBox[9];
	
	public Ex04() {
		setTitle("Money Changer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		JPanel topPanel = new JPanel();
		topPanel.setLayout(new FlowLayout());
		contentPane.add(topPanel,BorderLayout.NORTH);
		JPanel contentPanel = new JPanel();
		
		contentPanel.setLayout(new GridLayout(9,3,10,10));
		contentPane.add(contentPanel,BorderLayout.CENTER);
		
		topPanel.setOpaque(true);
		topPanel.setBackground(Color.gray);
		
		JLabel title = new JLabel("금액");
		JTextField money = new JTextField("",15);
		JButton btnCalc = new JButton("계산");
		topPanel.add(title);
		topPanel.add(money);
		topPanel.add(btnCalc);
		
		for(int i=0;i<moneyTitles.length;i++) {
			JLabel moneyTitleLabel = new JLabel(moneyTitles[i]);
			tfList[i] = new JTextField(20);
			cbList[i] = new JCheckBox();
			contentPanel.add(moneyTitleLabel);
			contentPanel.add(tfList[i]);
			contentPanel.add(cbList[i]);
		}
		
		btnCalc.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String temp = money.getText();
				if(temp.length()==0) return;
				int realMoney = Integer.parseInt(temp);
//				System.out.println(realMoney);
				int rest;
				for(int i=0;i<tfList.length;i++) {
					if(!cbList[i].isSelected()) {
						tfList[i].setText("0");
						continue;
					}
					rest = realMoney/units[i];
					tfList[i].setText(Integer.toString(rest));
					if(rest>0) realMoney = realMoney%units[i];
				}
			}
		});
		
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex04();
	}
}
