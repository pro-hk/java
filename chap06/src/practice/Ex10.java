package practice;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1번째 선수 이름>>");
		String firstPlayer = scanner.next();
		System.out.print("2번째 선수 이름>>");
		String secondPlayer = scanner.next();
		
		int firstNum;
		int secondNum;
		int thirdNum;
		String enter = scanner.nextLine();
		while(true) {
		System.out.print("["+firstPlayer+"]:<Enter>");
		enter = scanner.nextLine();
		firstNum = (int)Math.ceil(Math.random()*3);
		secondNum = (int)Math.ceil(Math.random()*3);
		thirdNum = (int)Math.ceil(Math.random()*3);
		if (firstNum == secondNum && secondNum == thirdNum) {
			System.out.println(firstNum +" "+ secondNum +" "+ thirdNum+" " + firstPlayer+"님이 이겼습니다!");
			break;
		}
		System.out.println(firstNum +" " + secondNum +" " + thirdNum +" " + "아쉽군요!");
		System.out.print("["+secondPlayer+"]:<Enter>");
		enter = scanner.nextLine();
		firstNum = (int)Math.ceil(Math.random()*3);
		secondNum = (int)Math.ceil(Math.random()*3);
		thirdNum = (int)Math.ceil(Math.random()*3);
		if (firstNum == secondNum && secondNum == thirdNum) {
			System.out.println(firstNum +" " + secondNum +" " + thirdNum +" " + secondPlayer+"님이 이겼습니다!");
			break;
		}
		System.out.println(firstNum +" " + secondNum +" " + thirdNum +" " + "아쉽군요!");
		}
		scanner.close();
	}
}
