package lecture;

import java.util.Scanner;

public class ArrayExample {
	public static void main(String[] args) {
		// int [] arr; ��� ���� -- ArrayList�� �� ���� ��(�߰�, ���� ����)
		int arr[] = new int[10]; // new int[���� ����]
		int arr02[] = { 1, 2, 3, 100, 5, 6, 7, 8, 9, 10 }; // {} ���� ���ϴ� ��ŭ
//		int arr03[10]; -- �Ұ���
		arr[0] = 10;
		arr[1] = 15;
		arr[2] = 17;
		arr[3] = 32;
		arr[4] = 80;
		System.out.println(arr[3]);
		System.out.println(arr[8]);
//		System.out.println(arr[10]);   -- ����
		System.out.println(arr02[3]);

		// ���� 5�� �޾Ƽ� �迭�� ������
		// 3��° �� ���
		Scanner scanner = new Scanner(System.in);
		int arr03[] = new int[5];
		int max = 0;
		int total = arr03.length;
		System.out.println("���� "+total+"�� �Է��Ͻÿ�");
		for (int i = 0; i < total; i++) {
//			int num = scanner.nextInt();
//			arr03[i] = num;
			arr03[i] = scanner.nextInt();
			if (arr03[i] > max) {
				max = arr03[i];
			}
		}
		System.out.println(arr03[2]);
		System.out.println(max);  // ���� ū �� ����ϱ�
		scanner.close();
	}
}
