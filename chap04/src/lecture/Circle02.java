package lecture;

public class Circle02 {
	int radius;
	String name;
	
	// constructor(생성자)는 return 타입이 없음
	// 생성자함수(method이며, 이름이 같아야함)
	// 여러개 작성이 가능(오버로딩)
	// new를 통해 객체가 생성될 때 한번 호출
	// 초기화
	// 만약 적지 않으면 compiler가 자동으로 하나 만들어서 집어 넣음(default constructor)
	public Circle02() {
		radius = 1;
	}
	public Circle02(int r, String n) {
		radius = r;
		name = n;
	}
	public double getArea() {
		return radius*radius*3.14;
	}
}
