package Exec2;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� 3���� �Է��Ͻÿ�");
		int num01 = scanner.nextInt();
		int num02 = scanner.nextInt();
		int num03 = scanner.nextInt();
		if (num01 + num02 > num03 || num02 + num03 > num01 || num03 + num01 > num02) {
			System.out.println("�ﰢ���� �˴ϴ�");
		} else {
			System.out.println("�ﰢ���� �ȵ˴ϴ�");
		}
		scanner.close();
	}
}