import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// Scanner import�ؼ� ������ ������ �Է¹ޱ�
		// 90�̻� A, 80�̻� B, 70�̻� C, 60�̻� D, ������ F
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		Math.abs(-1);
		int grade = scanner.nextInt();
		String result = null;
		if (grade >= 90) {
			result = "A";
		} else if (grade >= 80) {
			result = "B";
		} else if (grade >= 70) {
			result = "C";
		} else if (grade >= 60) {
			result = "D";
		} else {
			result = "F";
		}
		System.out.println("����� ������ " + result + " �Դϴ�.");
		scanner.close();
	}

}
