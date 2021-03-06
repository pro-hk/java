package lecture;

class Point{
	private int x ,y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	@Override
	public boolean equals(Object obj) {
		Point tempPoint = (Point)obj;
		if(x == tempPoint.x && y == tempPoint.y) return true;
		return false;
	}
}

public class ObjectTest {
	public static void print(Object obj) {
		System.out.println(obj.getClass().getName());
		System.out.println(obj.hashCode());
//		System.out.println(obj.toString());
		System.out.println(obj);
	}
	
	public static void main(String[] args) {
		Point point01 = new Point(10,20);
		Point point02 = new Point(10,20);
		Point point03 = point01;
		System.out.println(point01==point02);
		System.out.println(point01==point03);
		System.out.println(point01.equals(point02));
//		print(point01);
//		print(point02);
	}
}
