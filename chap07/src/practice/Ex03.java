package practice;

import java.util.HashMap;
//import java.util.Iterator;
import java.util.Scanner;
//import java.util.Set;

public class Ex03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String,Integer> nations = new HashMap<>();
		System.out.println("나라 이름과 인구를 입력하세요.(예: Korea 5000)");
		while(true){
			System.out.print("나라 이름, 인구 >> ");
			String nation = scanner.next();   // 띄어쓰기하면 넘어감
			if(nation.equals("그만")) break;
			int num = scanner.nextInt();
			nations.put(nation, num);
		}
//		Set<String> keys = nations.keySet();
//		Iterator<String> it = keys.iterator();
//		while(it.hasNext()) {
//			String name = it.next();
//			System.out.println(name+"의 인구는 "+nations.get(name));
//		}
		while(true) {
			System.out.print("인구 검색 >> ");
			String nation = scanner.next();
			if(nation.equals("그만")) break;
			Integer num = nations.get(nation);
			if(num==null) System.out.println(nation+" 나라는 없습니다.");
			else System.out.println(nation+"의 인구는 "+num);
		}
		scanner.close();
	}
}
