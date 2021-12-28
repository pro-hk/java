package lecture;

class Shape {
	public void draw() {
		System.out.println("Shape �׸���");
	}
}

class Line extends Shape {
	public void draw() {
		System.out.println("Line �׸���");
	}
}

class Rect extends Shape {
	
	//Annotation -- Spring
	@Override
	public void draw() {
		System.out.println("Rect �׸���");
	}
}

class Circle extends Shape {
	public void draw() {
		System.out.println("Circle �׸���");
	}
}
// �޼��� �������̵� -- 1. �̸� ���ƾ� �� 2. ����Ÿ�� ���ƾ��� 3. �Ű����� ���ƾ���

class AA {
	public void draw() {
		System.out.println("AA �׸���");
	}
}
//����(run time) ���ε�(����) - ����� �� ���� -- override ������ �� �����Ǵ� �� �ƴ϶� ����� �� ����
public class MethodOverrideTest {
	// upcasting�� ���ؼ� ������ ũ�� �ձ�(Shape�� ��ӹ��� �ڽ��̸� �� ����)
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
