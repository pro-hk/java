package Exec2;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("2�ڸ��� ���� �Է�(10~99)");
		int num = scanner.nextInt();
		if(num<10 || num>99) {
			System.out.println("2�ڸ��� ������ �Է��ϼ���");
			scanner.close();
			return;
		}
		System.out.println(num/10 == num%10 ? "Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�." : "No! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�." );			
		scanner.close();
		}
	}


