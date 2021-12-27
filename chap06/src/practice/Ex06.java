package practice;

import java.util.Calendar;
import java.util.Scanner;

class Player{
	private Scanner scanner;
	private String name;
	public Player(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public Scanner getScanner() {
		return scanner;
	}
	public int turn() {
		System.out.println(name+"�� ���� �����մϴ�. enter�� ��������.");
		scanner = new Scanner(System.in);
		String enter = scanner.nextLine();
		Calendar now = Calendar.getInstance();
		int firstSec = now.get(Calendar.SECOND);
		System.out.println("���� �� �ð� = "+firstSec);
		enter = scanner.nextLine();
		now = Calendar.getInstance();
		int lastSec = now.get(Calendar.SECOND);
		System.out.println("���� �� �ð� = "+lastSec);
		if(lastSec < firstSec) lastSec +=60;
		return lastSec-firstSec;
	}
}

class Game{
	public Game() {
		
	}
	public void run() {
		Player playerList[] = new Player[2];
		playerList[0] = new Player("Ȳ����");
		playerList[1] = new Player("���繮");
		System.out.println("10�ʿ� ����� ����� �̱�� �����Դϴ�.");
		int player01Time = playerList[0].turn();
		int player02Time = playerList[1].turn();
		System.out.println(playerList[0].getName()+"�� ��� "+player01Time);
		System.out.println(playerList[1].getName()+"�� ��� "+player02Time);
		int player01Result = Math.abs(10-player01Time);
		int player02Result = Math.abs(10-player02Time);
		if(player01Result<player02Result) System.out.println("���ڴ� "+playerList[0].getName());
		else if(player01Result>player02Result) System.out.println("���ڴ� "+playerList[1].getName());
		else System.out.println("���º�");
		playerList[0].getScanner().close();
		playerList[1].getScanner().close();
	}
}

public class Ex06 {
	public static void main(String[] args) {
		Game game = new Game();
		game.run();
	}
}