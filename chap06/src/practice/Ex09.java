package practice;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
		System.out.print("ö��[����(1), ����(2), ��(3), ������(4)]>>");
		int user = scanner.nextInt();
		int computer = (int)Math.floor(Math.random()*3) + 1;
		if(user == 4) break; 
		String array[] = {"����", "����", "��"};
		String userChoice = array[user-1];
		String comChoice = array[computer-1];
		System.out.println("ö��("+userChoice+") : ��ǻ��("+comChoice+")");
		if(user-computer==-1 || user-computer==2) System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
		else if(user-computer==0 ) System.out.println("�����ϴ�.");
		else System.out.println("ö���� �̰���ϴ�.");
		}
		scanner.close();
	}
}
