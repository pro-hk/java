package lecture;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		int num = 0;
		int i = 0;
		int sum = 0;
		//sum�� double�� ������ �Ҽ������� ����
		// ������ ������ �Է¹޾Ƽ� ����� ���϶�. -1�� �Է��ϸ� ����ȴ�.
//		while (i < 10) {
//			System.out.println("���� 10���� ���� ������ ������ �����ϴ� while�Դϴ�.");
//			i++;
//		}
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է��Ͻÿ�. �������� -1�� �Է��ϸ� ����� �����帳�ϴ�.");
		num = scanner.nextInt();
		/*
		while(num != -1) {
//			System.out.println("���� -1�� �Է¹��� ������ ��� ���� �����ϴ� while�Դϴ�.");
			sum+=num;
			i+=1;
			num = scanner.nextInt();
		}
		*/
		while(true) {
//			System.out.println("���� -1�� �Է¹��� ������ ��� ���� �����ϴ� while�Դϴ�.");
			if(num==-1) break;
			sum+=num;
			i+=1;
			num = scanner.nextInt();
		}
		System.out.println("����� "+i+"�� �Է��Ͽ��� ����� "+sum/i+"�Դϴ�.");
		scanner.close();
	}
}
