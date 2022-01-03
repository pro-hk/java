package lecture;

import java.util.Scanner;

public class ConverterTest {
	public static void main(String[] args) {
		System.out.println("오늘의 환율을 입력하시오.");
		Scanner scanner = new Scanner(System.in);
		CurrentConverter.setRate(scanner.nextDouble());
		System.out.println("1000000원은 달러로 "+CurrentConverter.toDollar(1000000));
		System.out.println("$100은 원화로 "+CurrentConverter.toKRWon(100));
		scanner.close();
	}
}
