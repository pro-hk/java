package practice;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		int unit[] = {50000,10000,5000,1000,500,100,50,10,1};
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		int money = scanner.nextInt();
		for(int i=0;i<unit.length;i++) {
			int rest = money/unit[i];
			if(rest>0) {
				System.out.println(unit[i]+"�� ¥�� : "+ rest+"��");
				money = money%unit[i];
			}
		}
		scanner.close();
	}
}
