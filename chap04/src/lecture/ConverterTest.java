package lecture;

import java.util.Scanner;

public class ConverterTest {
	public static void main(String[] args) {
		System.out.println("������ ȯ���� �Է��Ͻÿ�.");
		Scanner scanner = new Scanner(System.in);
		CurrentConverter.setRate(scanner.nextDouble());
		System.out.println("1000000���� �޷��� "+CurrentConverter.toDollar(1000000));
		System.out.println("$100�� ��ȭ�� "+CurrentConverter.toKRWon(100));
		scanner.close();
	}
}
