package lecture;

public class Lecture03 {

	public static void main(String[] args) {
		System.out.println("Hello World");
		// int num = 10; , double = 10.0; char = 'a' , boolean, String = "fsdafva"
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
//			System.out.println(i);
			sum = sum + i;
			System.out.print(i);
			if (i == 10) {
				System.out.print("=");
			} else {
				System.out.print("+");
			}
		}
		System.out.print(sum);
	}

}
