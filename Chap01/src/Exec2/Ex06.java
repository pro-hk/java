package Exec2;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1~99 ������ ������ �Է��Ͻÿ�");
		int num = scanner.nextInt();
		int first = num / 10;
		int second = num % 10;
		if (first % 3 == 0 && first != 0) {
			if (second % 3 == 0 && second != 0) {
				System.out.println("�ڼ�¦¦");
			} else {
				System.out.println("�ڼ�¦");
			}
		} else {
			if (second % 3 == 0 && second != 0) {
				System.out.println("�ڼ�¦");
			}
		}
		scanner.close();
	}
}
