package lecture;

import java.util.Scanner;

public class ArrayExample02 {

	public static void main(String[] args) {
		// 5개짜리 배열을 입력받아서 만들고 평균 출력해보기
		Scanner scanner = new Scanner(System.in);
		int arr[] = new int[5];
		int sum = 0;
		int total = arr.length;
		System.out.println("값을 " + total + "개 입력하시오");
		for (int i = 0; i < total; i++) {
			arr[i] = scanner.nextInt();
//			sum += arr[i];
		}
		for(int k : arr) {  // forEach
			sum +=k;
		}
		double avg = sum / total;
		System.out.println("평균은 " + avg);
		scanner.close();
		
		String fruits[] = {"apple", "banana", "orange","kiwi"};
		for(String item : fruits) {
			System.out.print(item+"==");
		}
	}

}
