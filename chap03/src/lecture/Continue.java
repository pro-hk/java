package lecture;

import java.util.Scanner;

public class Continue {
	// 정수 5개를 입력받아서 합 구하기
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		System.out.println("정수를 입력하세요");
		for(int i = 1; i<6; i++) {
			int num = scanner.nextInt();
			if(num<=0) continue;
			// break는 반복문 블럭을 빠져나가기
			// continue는 건너뛰기
			sum += num;
		}
		System.out.println(sum);
		scanner.close();
	}
}
