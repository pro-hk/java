package practice;

import java.awt.Container;
import java.awt.Font;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class ClockLabel extends JLabel implements Runnable {
	private Thread th;

	public ClockLabel() {
		setFont(new Font("¸¼Àº °íµñ",Font.BOLD,48));
		setHorizontalAlignment(JLabel.CENTER);
		setText(makeTime());
		th = new Thread(this);
		th.start();
	}
	
	private String addZero(int num) {
		if(num<10) return "0"+num;
		else return ""+num;
	}
	
	public String makeTime() {
		Calendar calendar = Calendar.getInstance();
		String hour = addZero(calendar.get(Calendar.HOUR_OF_DAY));
		String min = addZero(calendar.get(Calendar.MINUTE));
		String sec = addZero(calendar.get(Calendar.SECOND));
		
		String txt = hour + " : "+min + " : " + sec;
		return txt;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
				this.setText(makeTime());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Ex03 extends JFrame {
	
	public Ex03(){
	setTitle("µðÁöÅÐ ½Ã°è ¸¸µé±â");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	Container contentPane = getContentPane();
	contentPane.add(new ClockLabel());
	
	setSize(500,500);
	setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex03();
	}
}
