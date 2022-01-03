package lecture;

import java.util.Scanner;

public class ArrayExample {
	public static void main(String[] args) {
		// int [] arr; 상관 없음 -- ArrayList를 더 많이 씀(추가, 삭제 가능)
		int arr[] = new int[10]; // new int[원소 갯수]
		int arr02[] = { 1, 2, 3, 100, 5, 6, 7, 8, 9, 10 }; // {} 내가 원하는 만큼
//		int arr03[10]; -- 불가능
		arr[0] = 10;
		arr[1] = 15;
		arr[2] = 17;
		arr[3] = 32;
		arr[4] = 80;
		System.out.println(arr[3]);
		System.out.println(arr[8]);
//		System.out.println(arr[10]);   -- 오류
		System.out.println(arr02[3]);

		// 정수 5개 받아서 배열로 만들어보기
		// 3번째 값 출력
		Scanner scanner = new Scanner(System.in);
		int arr03[] = new int[5];
		int max = 0;
		int total = arr03.length;
		System.out.println("값을 "+total+"개 입력하시오");
		for (int i = 0; i < total; i++) {
//			int num = scanner.nextInt();
//			arr03[i] = num;
			arr03[i] = scanner.nextInt();
			if (arr03[i] > max) {
				max = arr03[i];
			}
		}
		System.out.println(arr03[2]);
		System.out.println(max);  // 제일 큰 수 출력하기
		scanner.close();
	}
}
