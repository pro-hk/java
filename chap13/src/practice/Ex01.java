package practice;

import java.util.Scanner;

class CountThread implements Runnable{
	@Override
	public void run() {
		System.out.println("스레드 실행 시작");
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
		System.out.println("스레드 종료");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("아무 키나 입력>> ");
		scanner.nextLine();
		Thread countThread = new Thread(new CountThread());
		countThread.start();
	}
}
