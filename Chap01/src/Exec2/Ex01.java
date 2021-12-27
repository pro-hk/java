package Exec2;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("원화를 입력하세요(단위 원)");
		int won = scanner.nextInt();
		double dollar = won / 1100;
		System.out.println(won + "원은 $"+dollar+"입니다.");
		scanner.close();
	}
}
