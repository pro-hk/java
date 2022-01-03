package lecture;

import java.util.Scanner;

public class DivideZero {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num ;
		int divisor;
		System.out.println("숫자를 입력하시오.");
		num = scanner.nextInt();
		System.out.println("어떤 수로 나누어볼까요.");
		divisor = scanner.nextInt();
		try {
			System.out.println(num+"를 "+divisor+"로 나누면 "+num/divisor+"입니다.");			
		} catch (Exception e) {
			e.printStackTrace();
		}
//		try {
//			System.out.println(num+"를 "+divisor+"로 나누면 "+num/divisor+"입니다.");			
//		} catch (ArithmeticException e) {
//			System.out.println("0으로 나눌 수 없어요.");
//		}
		
		scanner.close();
	}
}
