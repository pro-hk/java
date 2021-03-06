package lecture;

import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
//		Calendar now = new Calendar(); 
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int date = now.get(Calendar.DATE);
		int hour = now.get(Calendar.HOUR_OF_DAY);  // 24시
		int hour01 = now.get(Calendar.HOUR);  // 12시
		int ampm = now.get(Calendar.AM_PM);
		int am = now.get(Calendar.AM);
		int pm = now.get(Calendar.PM);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		int day = now.get(Calendar.DAY_OF_WEEK);
		if(ampm==am) System.out.println("오전");
		System.out.println(year+"년"+(month+1)+"월"+date+"일");
		System.out.println(hour+"시"+minute+"분"+second+"초");
		System.out.println(hour01+"시"+minute+"분"+second+"초");
		System.out.println(ampm+"시"+minute+"분"+second+"초");
//		System.out.println(am);
//		System.out.println(pm);
//		System.out.println(ampm);
		System.out.println("day==="+day);
		System.out.println(Calendar.SUNDAY);
		switch(day) {
		case Calendar.SUNDAY : System.out.println("일요일"); break;
		case Calendar.MONDAY : System.out.println("월요일"); break;
		case Calendar.TUESDAY : System.out.println("화요일"); break;
		case Calendar.WEDNESDAY : System.out.println("수요일"); break;
		case Calendar.THURSDAY : System.out.println("목요일"); break;
		case Calendar.FRIDAY : System.out.println("금요일"); break;
		case Calendar.SATURDAY : System.out.println("토요일"); break;
		}
		String days[] = {"일","월","화","수","목","금","토"};
		System.out.println(days[day-1]);
	}
}
