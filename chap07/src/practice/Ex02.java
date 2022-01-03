package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
		String str = scanner.next();
		ArrayList<Character> scoreList = new ArrayList<>();
		for(int i=0;i<6;i++) {
			char ch = str.charAt(i);
			scoreList.add(ch);
		}
		double sum = 0;
		for(int i=0;i<6;i++) {
			char ch = scoreList.get(i);
			switch(ch) {
			case 'a': sum+= 4.0; break;
			case 'b': sum+= 3.0; break;
			case 'c': sum+= 2.0; break;
			case 'd': sum+= 1.0; break;
			case 'f': sum+= 0.0; break;
			}
		}
		System.out.println(sum/scoreList.size());
		scanner.close();
	}
}
