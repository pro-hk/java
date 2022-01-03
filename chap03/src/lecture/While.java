package lecture;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		int num = 0;
		int i = 0;
		int sum = 0;
		//sum을 double로 잡으면 소수점까지 나옴
		// 정수를 여러개 입력받아서 평균을 구하라. -1을 입력하면 종료된다.
//		while (i < 10) {
//			System.out.println("나는 10보다 작을 때까지 뭔가를 수행하는 while입니다.");
//			i++;
//		}
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하시오. 마지막에 -1을 입력하면 평균을 보여드립니다.");
		num = scanner.nextInt();
		/*
		while(num != -1) {
//			System.out.println("나는 -1을 입력받을 때까지 계속 일을 수행하는 while입니다.");
			sum+=num;
			i+=1;
			num = scanner.nextInt();
		}
		*/
		while(true) {
//			System.out.println("나는 -1을 입력받을 때까지 계속 일을 수행하는 while입니다.");
			if(num==-1) break;
			sum+=num;
			i+=1;
			num = scanner.nextInt();
		}
		System.out.println("당신은 "+i+"개 입력하였고 평균은 "+sum/i+"입니다.");
		scanner.close();
	}
}
