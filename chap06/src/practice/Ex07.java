package practice;

import java.util.Scanner;
//import java.util.StringTokenizer;

public class Ex07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print(">>");
			String str = scanner.nextLine();
			if(str.equals("�׸�")) {
				System.out.println("�����մϴ�...");
				break;
			}
//			StringTokenizer st = new StringTokenizer(str," ");  (1)
//			System.out.println("���� ������ "+st.countTokens());
			String words[] = str.split(" ");
			System.out.println("���� ������ "+words.length); // (2)
		}
		scanner.close();
	}
}
