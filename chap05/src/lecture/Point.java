package lecture;

public class Point {
	// field, properties, ����, ����
	private int x;
	private int y;
	
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void showPoint() {
		System.out.println("{"+x+","+y+"}");
	}
	
	public Point() {
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
