package lecture;

public class Circle {
	int radius;  // 속성, properties, field member field
	String name;
	
	public Circle() {
		// 생성자 함수
		System.out.println("원이 생성되었습니다.");
	}
	public Circle(int radius) {
		this.radius = radius;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
}
