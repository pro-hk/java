package Exec2;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ݾ��� �Է��Ͻÿ�");
		int price = scanner.nextInt();
		int ������ = price / 50000;
		int ���� = (price % 50000) / 10000;
		int õ�� = (price % 10000) / 1000;
		int ��� = (price % 1000) / 100;
		int ���ʿ� = (price % 100) / 50;
		int �ʿ� = (price % 50) / 10;
		int �Ͽ� = price % 10;
		System.out.println("�������� " + ������ + "��");
		System.out.println("������ " + ���� + "��");
		System.out.println("õ���� " + õ�� + "��");
		System.out.println("��� " + ��� + "��");
		System.out.println("���ʿ� " + ���ʿ� + "��");
		System.out.println("�ʿ� " + �ʿ� + "��");
		System.out.println("�Ͽ� " + �Ͽ� + "��");
		scanner.close();
	}
}