package lecture;

import java.util.Random;

public class MathTest {
	public static void main(String[] args) {
		System.out.println(Math.abs(-1));
		System.out.println(Math.cos(0));
		System.out.println(Math.ceil(0.1));
		System.out.println(Math.round(0.5));
		System.out.println(Math.floor(0.5));
		System.out.println(Math.sqrt(2));
		System.out.println(Math.random()*10);
		Random random = new Random();
		System.out.println(random.nextInt());
		System.out.println(random.nextInt(100));
		System.out.println(Math.exp(2));
	}
}
