package lecture;

public class ColorPoint extends Point {
	private String color;
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() {
		System.out.print("color : "+color+" ,");
		this.showPoint();
	}
	public ColorPoint() {
		set(0,0);
		color = "white";
//		showColorPoint();
	}
	public ColorPoint(int x, int y, String color) {
		// set(x,y)
		super(x,y);
		this.color = color;
	}
}
