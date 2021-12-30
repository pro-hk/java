package lecture;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTest {
	// 검색할 때 주로 씀(순서 상관 없음)
	public static void main(String[] args) {
		HashMap<String,String> dictionary = new HashMap<String,String>();
		dictionary.put("baby", "아기");
		dictionary.put("love", "사랑");
		dictionary.put("apple", "사과");
//		System.out.println(dictionary.get("love"));
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("찾을 단어를 입력해주세요. exit을 입력하면 종료합니다.");
			String eng = scanner.nextLine();
			if(eng.equals("exit")) break;
			String kor = dictionary.get(eng);
			if(kor==null) System.out.println("없는 단어입니다.");
			else System.out.println(kor);
		}
		scanner.close();		
	}
}
