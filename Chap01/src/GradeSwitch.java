import java.util.Scanner;

public class GradeSwitch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		int score = scanner.nextInt();
		String result = null;
		switch (score / 10) {
		case 10:
			// result = "A";
			// break;
		case 9:
			result = "A";
			break;
		case 8:
			result = "B";
			break;
		case 7:
			result = "C";
			break;
		case 6:
			result = "D";
			break;
		default:
			result = "F";
		}
		// int result = score / 10;
		System.out.println(result);
		// 버림 == Math.floor
		scanner.close();
	}

}
