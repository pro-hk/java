package lecture;

public class ColorPointTest {

	public static void main(String[] args) {
		Point point = new Point();
		point.set(10, 10);
		point.showPoint();
		
		ColorPoint colorPoint = new ColorPoint(20,20,"blue");
//		colorPoint.set(20, 20);
//		colorPoint.showPoint();
//		colorPoint.setColor("blue");
		colorPoint.showColorPoint();
	}

}
