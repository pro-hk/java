package lecture;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListTest {
	// 쓰레드.. 멀티쓰레드..
	// Map: key:value  --  순서없이 들어감  -- put(key,value) / get(key)
	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		// while로 바꿔서 입력한 이름이 그만 들어오면 빠져나가서 입력한 이름들 출력하기
		// while(true){   -- for에 true와 동일
		for(int i=0;true;i++) {
			System.out.println("이름을 입력하세요.");
			String name = scanner.nextLine();
			if(name.equals("그만")) break;
			strList.add(name);
		}
		for(int i=0;i<strList.size();i++) {
			String name = strList.get(i);
			System.out.print(name+"/");
		}
		// 제일 긴 이름 출력해보기
		int longIdx = 0;
		for(int i=0;i<strList.size();i++) {
			if(strList.get(longIdx).length()<strList.get(i).length()) {
				longIdx = i;
			}
		}
		System.out.println("제일 긴 이름은 === "+strList.get(longIdx));
		// Vector, ArrayList : 순환가능(iterable)
		Iterator<String> it = strList.iterator();
		System.out.println(it.hasNext());
		while(it.hasNext()) {
			System.out.print(it.next()+"/");
		}
		scanner.close();
	}
}
