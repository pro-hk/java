package lecture;

class Shape {
	public void draw() {
		System.out.println("Shape 그리기");
	}
}

class Line extends Shape {
	public void draw() {
		System.out.println("Line 그리기");
	}
}

class Rect extends Shape {
	
	//Annotation -- Spring
	@Override
	public void draw() {
		System.out.println("Rect 그리기");
	}
}

class Circle extends Shape {
	public void draw() {
		System.out.println("Circle 그리기");
	}
}
// 메서드 오버라이드 -- 1. 이름 같아야 함 2. 리턴타입 같아야함 3. 매개변수 같아야함

class AA {
	public void draw() {
		System.out.println("AA 그리기");
	}
}
//동적(run time) 바인딩(묶기) - 실행될 때 결정 -- override 컴파일 때 결정되는 게 아니라 실행될 때 결정
public class MethodOverrideTest {
	// upcasting을 통해서 구멍을 크게 뚫기(Shape을 상속받은 자식이면 다 가능)
	public static void paint(Shape p) {
		p.draw();
	}
	
	public static void paintShape(Shape s) {
		s.draw();
	}
	public static void paintCircle(Circle c) {
		c.draw();
	}
	public static void paintLine(Line l) {
		l.draw();
	}
	public static void paintRect(Rect r) {
		r.draw();
	}
	public static void main(String[] args) {
		paintShape(new Shape());
		paintCircle(new Circle());
		paintLine(new Line());
		paintRect(new Rect());
		paint(new Shape());
		paint(new Circle());
		paint(new Line());
		paint(new Rect());
	}
}
