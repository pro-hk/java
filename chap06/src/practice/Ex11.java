package practice;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(">>");
		String words = scanner.nextLine();
		String bufferWords[] = words.split(" ");
		while (true) {
			System.out.print("����: ");
			String commendWord = scanner.nextLine();
			if (commendWord.equals("�׸�")) {
				System.out.println("�����մϴ�");
				break;
			}

			String bufferCommendWord[] = commendWord.split("!");
			
			
			
			
			for (int i = 0; i < bufferWords.length; i++) {
				if (bufferWords[i].equals(bufferCommendWord[0])) {
					bufferWords[i] = bufferCommendWord[1];
				}
				System.out.print(bufferWords[i]);
			}
			System.out.println("�߸��� �����Դϴ�!");
		}
	}
}