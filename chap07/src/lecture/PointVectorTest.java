package lecture;

import java.util.Vector;

class Point{
	private int x,y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}

public class PointVectorTest {
	public static void main(String[] args) {
		Vector <Point> pointVector = new Vector<Point>();
		pointVector.add(new Point(3,3));
		pointVector.add(new Point(10,10));
		pointVector.add(new Point(100,100));
		for(int i=0; i<pointVector.size();i++) {
			System.out.println(pointVector.get(i));
		}
		pointVector.remove(1);
		System.out.println("제거한 후 결과 ====");
		for(int i=0; i<pointVector.size();i++) {
			System.out.println(pointVector.get(i));
		}
	}
}
