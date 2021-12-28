package lecture;

import java.util.Scanner;

public class Break {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		String txt = scanner.next(); -- ÀÌ¾îÁø ±ÛÀÚ¸¸ ÀÎ½Ä ex) ÀåÇõ ¹Ùº¸ -> ÀåÇõ
		while (true) {
			System.out.println(">>");
			String txt = scanner.nextLine(); // 1ÁÙ ÀÎ½Ä ex) ÀåÇõ ¹Ùº¸ -> ÀåÇõ ¹Ùº¸
			if (txt.equals("exit")) break;
		}
		System.out.println("Á¾·áÇÕ´Ï´Ù.");
		scanner.close();
//		String txt = "ÀåÇõ";
//		if(txt.equals("ÀåÇõ")) {} -- ¹®ÀÚ ¸Â´ÂÁö È®ÀÎ
	}
}
