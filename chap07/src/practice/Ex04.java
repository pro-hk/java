package practice;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Ex04 {
	
	public static void showRainAvg(Vector<Integer> vector) {
		int sum = 0;
		Iterator <Integer> it = vector.iterator();
		while(it.hasNext()) {
			int num = it.next();
			sum += num;
			System.out.print(num+" ");
		}
		System.out.println();
		System.out.println("현재 평균" + (sum/vector.size()));
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<Integer> vector = new Vector<>();
		while(true) {
			System.out.print("강수량 입력(0 입력시 종료)>>");
			int rainAmount = scanner.nextInt();
			if(rainAmount == 0) break;
			vector.add(rainAmount);
			showRainAvg(vector);
			/*
			int sum = 0;
			for(int i=0;i<vector.size();i++) {
				sum += vector.get(i);
				System.out.print(vector.get(i)+" ");
			}
			System.out.println();
			System.out.println("현재 평균 "+ sum/vector.size());
			*/
		}
		scanner.close();
	}
}
