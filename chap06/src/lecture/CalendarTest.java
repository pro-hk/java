package lecture;

import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
//		Calendar now = new Calendar(); 
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int date = now.get(Calendar.DATE);
		int hour = now.get(Calendar.HOUR_OF_DAY);  // 24��
		int hour01 = now.get(Calendar.HOUR);  // 12��
		int ampm = now.get(Calendar.AM_PM);
		int am = now.get(Calendar.AM);
		int pm = now.get(Calendar.PM);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		int day = now.get(Calendar.DAY_OF_WEEK);
		if(ampm==am) System.out.println("����");
		System.out.println(year+"��"+(month+1)+"��"+date+"��");
		System.out.println(hour+"��"+minute+"��"+second+"��");
		System.out.println(hour01+"��"+minute+"��"+second+"��");
		System.out.println(ampm+"��"+minute+"��"+second+"��");
//		System.out.println(am);
//		System.out.println(pm);
//		System.out.println(ampm);
		System.out.println("day==="+day);
		System.out.println(Calendar.SUNDAY);
		switch(day) {
		case Calendar.SUNDAY : System.out.println("�Ͽ���"); break;
		case Calendar.MONDAY : System.out.println("������"); break;
		case Calendar.TUESDAY : System.out.println("ȭ����"); break;
		case Calendar.WEDNESDAY : System.out.println("������"); break;
		case Calendar.THURSDAY : System.out.println("�����"); break;
		case Calendar.FRIDAY : System.out.println("�ݿ���"); break;
		case Calendar.SATURDAY : System.out.println("�����"); break;
		}
		String days[] = {"��","��","ȭ","��","��","��","��"};
		System.out.println(days[day-1]);
	}
}