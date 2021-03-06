package practice;

class MyPoint{
	private int x,y;
	
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point (" + x + "," + y + ")";
	}
	@Override
	public boolean equals(Object obj) {
		MyPoint temp = (MyPoint)obj;
		if(temp.x == x && temp.y == y) return true;
		return false;
	}
	
}

public class Ex01 {
	public static void main(String[] args) {
		MyPoint p = new MyPoint(3,50);
		MyPoint q = new MyPoint(4,50);
		if(p.equals(q))
			System.out.println("같은 점");
		else
			System.out.println("다른 점");
	}
}
