package Exec2;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 3개를 입력하시오");
		int num01 = scanner.nextInt();
		int num02 = scanner.nextInt();
		int num03 = scanner.nextInt();
		if (num01 <= num02) {
			if (num02 <= num03) {
				System.out.println("중간 값은 " + num02);
			} else if (num03 <= num01){
				System.out.println("중간 값은 " + num01);
			} else {
				System.out.println("중간 값은 " + num03);
			}
		} else {
			if (num01 <= num03) {
				System.out.println("중간 값은 " + num01);
			} else if (num03 <= num02){
				System.out.println("중간 값은 " + num02);
			} else {
				System.out.println("중간 값은 " + num03);
			}
		}
		scanner.close();
	}

}
