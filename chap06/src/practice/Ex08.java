package practice;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		System.out.println("문자열을 입력하세요. 빈칸이나 있어도 되고 영어 한글 모두 됩니다.");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String words[] = str.split("");
		String firstWord = words[0];
		while (true) {
			String newfirstWord = words[0];
			for (int i = 0; i < words.length; i++) {
				if (i == words.length - 1) words[i] = newfirstWord;
				else words[i] = words[i + 1];
				System.out.print(words[i]);
			}
			System.out.println();
			if (words[0].equals(firstWord)) break;
		}
		scanner.close();
	}
//		System.out.println(words[0]);
//		words[0]=words[1];
//		System.out.println(words[0]);
//		words[1]=words[0];
//		System.out.println(words[1]);
}
