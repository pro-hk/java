package lecture;

import java.util.Scanner;

public class ArrayExample02 {

	public static void main(String[] args) {
		// 5��¥�� �迭�� �Է¹޾Ƽ� ����� ��� ����غ���
		Scanner scanner = new Scanner(System.in);
		int arr[] = new int[5];
		int sum = 0;
		int total = arr.length;
		System.out.println("���� " + total + "�� �Է��Ͻÿ�");
		for (int i = 0; i < total; i++) {
			arr[i] = scanner.nextInt();
//			sum += arr[i];
		}
		for(int k : arr) {  // forEach
			sum +=k;
		}
		double avg = sum / total;
		System.out.println("����� " + avg);
		scanner.close();
		
		String fruits[] = {"apple", "banana", "orange","kiwi"};
		for(String item : fruits) {
			System.out.print(item+"==");
		}
	}

}
