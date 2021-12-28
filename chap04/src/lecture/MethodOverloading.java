package lecture;

public class MethodOverloading {
	// 메서드 오버로딩은 매서드의 이름이 같고 "매개변수의 갯수나 타입"이 다를 때..
	// 리턴 타입은 상관 없음
	// 함수와 같음..
	public int getSum(int a, int b) {
		return a + b;
	}
	public int getSum(int a, int b, int c) {
		return a + b + c;
	}
	public double getSum(double a, double b) {
		return a + b;
	}
//	public double getSum(int a, int b) {
//		return (double)(a + b);
//	}  -- 성립안함
}
