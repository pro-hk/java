package lecture;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 3개를 입력하시오.");
		int sum = 0, num = 0;
		for (int i = 0; i < 3; i++) {
			System.out.println(i + ">>");
			try {
				num = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("정수가 아닙니다. 다시 입력해 주세요.");
				scanner.next();
				i--;
				continue;
			}
			sum+=num;
		}
		System.out.println("합은==="+sum);
		scanner.close();
		
		System.out.println(Integer.parseInt("30"));
		System.out.println(Integer.parseInt("3.14"));
	}

}
