package practice.Ex11;

import java.util.Scanner;
import java.util.Vector;

public class Game {
	private Vector<Nation> countries = new Vector<>();
	private Scanner scanner = new Scanner(System.in);
	public Game() {
		countries.add(new Nation("한국","서울"));
		countries.add(new Nation("미국","워싱턴"));
		countries.add(new Nation("중국","베이징"));
		countries.add(new Nation("일본","도쿄"));
		countries.add(new Nation("영국","런던"));
		countries.add(new Nation("호주","캔버라"));
		countries.add(new Nation("멕시코","멕시코시티"));
	}
	private boolean contain(String country) {
		for(int i=0;i<countries.size();i++) {
			String searchCountry = countries.get(i).getCountry();
			if(searchCountry.equals(country)) {
				return true;
			} 
		}
		return false;
	}
	// 입력 record()
	public void record() {
		int total = countries.size();
		int count = total;
		System.out.println("현재 "+total+"개 나라와 수도가 입력되어 있습니다.");
		while(true) {
			System.out.print("나라와 수도 입력"+(count+1)+">> ");
			String country = scanner.next();
			if(country.equals("그만")) break;
			String capital = scanner.next();
			if(contain(country)) {
				System.out.println(country+"는 이미 있습니다!");
				continue;
			}
			countries.add(new Nation(country, capital));
			count ++;
		}
	}
	// run()
	public void run() {
		System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
		while(true) {
			System.out.print("입력1, 퀴즈:2, 종료:3>>");
			int selectMenu = scanner.nextInt();
			switch(selectMenu) {
			case 1 : record(); break;
			case 2 : quiz(); break;
			case 3 : finish(); return;
			default : error();
			}
		}
	}
	private void quiz() {
		while(true) {
			int random = (int)(Math.random()*countries.size());
			Nation nation = countries.get(random);
			String country = nation.getCountry();
			String capital = nation.getCapital();
			System.out.print(country+"의 수도는? ");
			String userAnswer = scanner.next();
			if(userAnswer.equals("그만")) break;
			if(capital.equals(userAnswer)) System.out.println("정답!!"); 
			else System.out.println("아닙니다!!");
		}
		
	}
	private void error() {
		System.out.println("잘못 눌렀습니다. 1,2,3 중에 눌러주세요.");
		
	}
	// start()
	private void finish() {
		System.out.println("게임을 종료합니다.");
	}
}
