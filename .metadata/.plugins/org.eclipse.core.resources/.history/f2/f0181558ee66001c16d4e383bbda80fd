package practice;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
		System.out.print("철수[가위(1), 바위(2), 보(3), 끝내기(4)]>>");
		int user = scanner.nextInt();
		int computer = (int)Math.floor(Math.random()*3) + 1;
		if(user == 4) break; 
		String array[] = {"가위", "바위", "보"};
		String userChoice = array[user-1];
		String comChoice = array[computer-1];
		System.out.println("철수("+userChoice+") : 컴퓨터("+comChoice+")");
		if(user-computer==-1 || user-computer==2) System.out.println("컴퓨터가 이겼습니다.");
		else if(user-computer==0 ) System.out.println("비겼습니다.");
		else System.out.println("철수가 이겼습니다.");
		}
		scanner.close();
	}
}
