package lecture;

import java.util.Scanner;

public class DivideZero {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num ;
		int divisor;
		System.out.println("���ڸ� �Է��Ͻÿ�.");
		num = scanner.nextInt();
		System.out.println("� ���� ��������.");
		divisor = scanner.nextInt();
		try {
			System.out.println(num+"�� "+divisor+"�� ������ "+num/divisor+"�Դϴ�.");			
		} catch (Exception e) {
			e.printStackTrace();
		}
//		try {
//			System.out.println(num+"�� "+divisor+"�� ������ "+num/divisor+"�Դϴ�.");			
//		} catch (ArithmeticException e) {
//			System.out.println("0���� ���� �� �����.");
//		}
		
		scanner.close();
	}
}
