import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// Scanner import해서 점수를 정수로 입력받기
		// 90이상 A, 80이상 B, 70이상 C, 60이상 D, 나머지 F
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
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
		System.out.println("당신의 학점은 " + result + " 입니다.");
		scanner.close();
	}

}
