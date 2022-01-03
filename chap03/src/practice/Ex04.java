package practice;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		String str = scanner.next();
		char ch = str.charAt(0);
		for (char i = ch; i >= 'a'; i--) {
			for (char j = 'a'; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		scanner.close();
	}
}
