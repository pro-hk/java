package practice;

public class Ex01 {
	public static void main(String[] args) {
		int sum = 0, i = 0;
		while (i < 100) {
			sum += i;
			i += 2;
		}
		System.out.println(sum);
		sum = 0;
		for (i = 0; i < 100; i += 2) {
			sum += i;
		}
		System.out.println(sum);
		sum = 0;
		i = 0;
		do {
			sum += i;
			i += 2;
		} while (i < 100);
		System.out.println(sum);
	}
}
