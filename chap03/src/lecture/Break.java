package lecture;

import java.util.Scanner;

public class Break {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		String txt = scanner.next(); -- 이어진 글자만 인식 ex) 장혁 바보 -> 장혁
		while (true) {
			System.out.println(">>");
			String txt = scanner.nextLine(); // 1줄 인식 ex) 장혁 바보 -> 장혁 바보
			if (txt.equals("exit")) break;
		}
		System.out.println("종료합니다.");
		scanner.close();
//		String txt = "장혁";
//		if(txt.equals("장혁")) {} -- 문자 맞는지 확인
	}
}
