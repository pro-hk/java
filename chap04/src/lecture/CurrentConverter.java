package lecture;

public class CurrentConverter {
	private static double rate = 1100;  // ����ȯ��
	public static double toDollar(double won) {
		return won/rate;
	}
	public static double toKRWon(double dollar) {
		return dollar * rate;
	}
	public static double getRate() { //�б�
		return rate;
	}
	public static void setRate(double rate) { //����
		CurrentConverter.rate = rate;
	}
	
}
