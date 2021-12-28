package lecture;

public class CurrentConverter {
	private static double rate = 1100;  // 고정환율
	public static double toDollar(double won) {
		return won/rate;
	}
	public static double toKRWon(double dollar) {
		return dollar * rate;
	}
	public static double getRate() { //읽기
		return rate;
	}
	public static void setRate(double rate) { //쓰기
		CurrentConverter.rate = rate;
	}
	
}
