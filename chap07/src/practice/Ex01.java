package practice;

import java.util.Scanner;
import java.util.Vector;

public class Ex01 {
	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>();
		Scanner scanner = new Scanner(System.in);
		System.out.print("����(-1�� �Էµ� ������)>>");
		while(true) {
			int num = scanner.nextInt();
			if(num == -1) break;
			vector.add(num);
		}
		int max = vector.get(0);
		for(int i = 0; i<vector.size();i++) {
			if(vector.get(i)>max) {
				max=vector.get(i);
			}
		}
		System.out.println("���� ū ���� "+max);
		scanner.close();
	}
}
