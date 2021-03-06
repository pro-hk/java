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
		System.out.println(name+"님 게임 시작합니다. enter를 누르세요.");
		scanner = new Scanner(System.in);
		String enter = scanner.nextLine();
		Calendar now = Calendar.getInstance();
		int firstSec = now.get(Calendar.SECOND);
		System.out.println("현재 초 시간 = "+firstSec);
		enter = scanner.nextLine();
		now = Calendar.getInstance();
		int lastSec = now.get(Calendar.SECOND);
		System.out.println("현재 초 시간 = "+lastSec);
		if(lastSec < firstSec) lastSec +=60;
		return lastSec-firstSec;
	}
}

class Game{
	public Game() {
		
	}
	public void run() {
		Player playerList[] = new Player[2];
		playerList[0] = new Player("황기태");
		playerList[1] = new Player("이재문");
		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
		int player01Time = playerList[0].turn();
		int player02Time = playerList[1].turn();
		System.out.println(playerList[0].getName()+"의 결과 "+player01Time);
		System.out.println(playerList[1].getName()+"의 결과 "+player02Time);
		int player01Result = Math.abs(10-player01Time);
		int player02Result = Math.abs(10-player02Time);
		if(player01Result<player02Result) System.out.println("승자는 "+playerList[0].getName());
		else if(player01Result>player02Result) System.out.println("승자는 "+playerList[1].getName());
		else System.out.println("무승부");
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
