package lecture;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTest {
	// �˻��� �� �ַ� ��(���� ��� ����)
	public static void main(String[] args) {
		HashMap<String,String> dictionary = new HashMap<String,String>();
		dictionary.put("baby", "�Ʊ�");
		dictionary.put("love", "���");
		dictionary.put("apple", "���");
//		System.out.println(dictionary.get("love"));
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("ã�� �ܾ �Է����ּ���. exit�� �Է��ϸ� �����մϴ�.");
			String eng = scanner.nextLine();
			if(eng.equals("exit")) break;
			String kor = dictionary.get(eng);
			if(kor==null) System.out.println("���� �ܾ��Դϴ�.");
			else System.out.println(kor);
		}
		scanner.close();		
	}
}
