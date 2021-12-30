package practice.Ex11;

import java.util.Scanner;
import java.util.Vector;

public class Game {
	private Vector<Nation> countries = new Vector<>();
	private Scanner scanner = new Scanner(System.in);
	public Game() {
		countries.add(new Nation("�ѱ�","����"));
		countries.add(new Nation("�̱�","������"));
		countries.add(new Nation("�߱�","����¡"));
		countries.add(new Nation("�Ϻ�","����"));
		countries.add(new Nation("����","����"));
		countries.add(new Nation("ȣ��","ĵ����"));
		countries.add(new Nation("�߽���","�߽��ڽ�Ƽ"));
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
	// �Է� record()
	public void record() {
		int total = countries.size();
		int count = total;
		System.out.println("���� "+total+"�� ����� ������ �ԷµǾ� �ֽ��ϴ�.");
		while(true) {
			System.out.print("����� ���� �Է�"+(count+1)+">> ");
			String country = scanner.next();
			if(country.equals("�׸�")) break;
			String capital = scanner.next();
			if(contain(country)) {
				System.out.println(country+"�� �̹� �ֽ��ϴ�!");
				continue;
			}
			countries.add(new Nation(country, capital));
			count ++;
		}
	}
	// run()
	public void run() {
		System.out.println("**** ���� ���߱� ������ �����մϴ�. ****");
		while(true) {
			System.out.print("�Է�1, ����:2, ����:3>>");
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
			System.out.print(country+"�� ������? ");
			String userAnswer = scanner.next();
			if(userAnswer.equals("�׸�")) break;
			if(capital.equals(userAnswer)) System.out.println("����!!"); 
			else System.out.println("�ƴմϴ�!!");
		}
		
	}
	private void error() {
		System.out.println("�߸� �������ϴ�. 1,2,3 �߿� �����ּ���.");
		
	}
	// start()
	private void finish() {
		System.out.println("������ �����մϴ�.");
	}
}
