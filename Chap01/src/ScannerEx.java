//import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		/*
		Scanner scanner = new Scanner(System.in); // 생성 instance
		System.out.println("이름을 입력하시오");
		String name = scanner.next();
		System.out.println("나의 이름은 " + name + " 입니다.");
		System.out.println("나이를 입력하시오");
		int age = scanner.nextInt();
		System.out.println("야야야 내나이가 어때서 " + age + " 입니다.");
		System.out.println("몸무게를 kg 단위로 입력하시오 ex) 80");
		double weight = scanner.nextInt();
		System.out.println("키를 cm 단위로 입력하시오 ex) 180");
		double height = scanner.nextInt();
		double Height = height / 100;
		double biman = weight / Height / Height;

		if (biman < 18.5) {
			System.out.println("저체중");
		} else if (biman < 23) {
			System.out.println("정상");
		} else if (biman < 25) {
			System.out.println("과체중");
		} else if (biman < 30) {
			System.out.println("비만");
		} else {
			System.out.println("고도비만");
		}
		// 18.5 보다 작으면 저체중
		// 23보다 작으면 정상
		// 25보다 작으면 과체중
		// 30보다 작으면 비만
		// 나머지는 고도비만

		scanner.close();
		*/
		
		// 삼항연산자
		int a = 30;
		int b = 20;
		System.out.println(a > b ? a-b : b-a );
	}

}