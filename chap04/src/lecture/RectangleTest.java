package lecture;

import java.util.Scanner;

public class RectangleTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Rectangle rect = new Rectangle();
		rect.width = scanner.nextInt();
		rect.height = scanner.nextInt();
		int area = rect.getArea();
		System.out.println(area);
		scanner.close();
	}

}
