package lecture;

import java.util.Scanner;

public class Continue {
	// ���� 5���� �Է¹޾Ƽ� �� ���ϱ�
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		System.out.println("������ �Է��ϼ���");
		for(int i = 1; i<6; i++) {
			int num = scanner.nextInt();
			if(num<=0) continue;
			// break�� �ݺ��� ���� ����������
			// continue�� �ǳʶٱ�
			sum += num;
		}
		System.out.println(sum);
		scanner.close();
	}
}
