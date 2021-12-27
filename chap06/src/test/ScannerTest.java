package test;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		char ch = 'a';
		int num = 10;
		String str = "aaa";  //원래는 생성자 선언해야됨 new String("aaa");
		Scanner scanner = new Scanner(System.in);
		Scanner scanner02 = new Scanner(System.in);
		Scanner scanner03 = scanner;
		System.out.println(scanner.hashCode());
		System.out.println(scanner02.hashCode());
		System.out.println(scanner.equals(scanner02));
		System.out.println(scanner.equals(scanner03));
	}
}
