package lecture;

import java.util.Scanner;

public class Break {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		String txt = scanner.next(); -- �̾��� ���ڸ� �ν� ex) ���� �ٺ� -> ����
		while (true) {
			System.out.println(">>");
			String txt = scanner.nextLine(); // 1�� �ν� ex) ���� �ٺ� -> ���� �ٺ�
			if (txt.equals("exit")) break;
		}
		System.out.println("�����մϴ�.");
		scanner.close();
//		String txt = "����";
//		if(txt.equals("����")) {} -- ���� �´��� Ȯ��
	}
}
