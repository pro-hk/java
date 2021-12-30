package practice;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 몇개?");
		int num = scanner.nextInt();
		int arr[] = new int[num];
		for (int i = 0; i < num; i++) {
			int ranNum = (int) (Math.random() * 10 + 1);
			for (int j = 0; j < i; j++) {
				if (arr[j] == ranNum) {
					i--;
				} else {
					arr[i] = ranNum;
				}
			}
			System.out.print(arr[i] + " ");
		}
		scanner.close();
	}
}
