package practice;

import java.util.Scanner;
//import java.util.StringTokenizer;

public class Ex07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print(">>");
			String str = scanner.nextLine();
			if(str.equals("그만")) {
				System.out.println("종료합니다...");
				break;
			}
//			StringTokenizer st = new StringTokenizer(str," ");  (1)
//			System.out.println("어절 개수는 "+st.countTokens());
			String words[] = str.split(" ");
			System.out.println("어절 개수는 "+words.length); // (2)
		}
		scanner.close();
	}
}
