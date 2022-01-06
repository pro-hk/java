package practice;

import java.util.Scanner;

class CountThread implements Runnable{
	@Override
	public void run() {
		System.out.println("������ ���� ����");
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(500);
				System.out.print(i + " ");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println();
		System.out.println("������ ����");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ƹ� Ű�� �Է�>> ");
		scanner.nextLine();
		Thread countThread = new Thread(new CountThread());
		countThread.start();
	}
}
