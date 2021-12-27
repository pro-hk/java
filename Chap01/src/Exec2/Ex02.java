package Exec2;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("2자리수 정수 입력(10~99)");
		int num = scanner.nextInt();
		if(num<10 || num>99) {
			System.out.println("2자리수 정수를 입력하세요");
			scanner.close();
			return;
		}
		System.out.println(num/10 == num%10 ? "Yes! 10의 자리와 1의 자리가 같습니다." : "No! 10의 자리와 1의 자리가 다릅니다." );			
		scanner.close();
		}
	}


