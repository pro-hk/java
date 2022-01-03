package lecture;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

class Student{
	private int id;
	private String tel;
	
	public Student(int id, String tel) {
		this.id = id;
		this.tel = tel;
	}

	public int getId() {
		return id;
	}

	public String getTel() {
		return tel;
	}
	
}

public class HashMapTest03 {
	public static void main(String[] args) {
		// 이름 : key
		// 장성호, new Student(1, "010-1111-2222")
		// 이중화, 2, 010-2222-3333
		HashMap<String,Student> studentMap = new HashMap<>();
		studentMap.put("이중화", new Student(1,"010-1111-1111"));
		studentMap.put("이성규", new Student(2,"010-2222-2222"));
		studentMap.put("최문성", new Student(3,"010-3333-3333"));
		studentMap.put("심재훈", new Student(4,"010-4444-4444"));
		Scanner scanner = new Scanner(System.in);
		Set<String> keys = studentMap.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String name = it.next();
//		while(true) {
//			System.out.println("검색할 이름을 쓰세요.");
//			String name = scanner.nextLine();
//			if(name.equals("exit")) break;
			Student student = studentMap.get(name);
			if(student==null) System.out.println("우리 반에 없어요.");
			else System.out.println(name+"님의 아이디는 "+student.getId()+"이고 전화번호는 "+student.getTel()+"입니다.");
		}		
		scanner.close();
	}
}
