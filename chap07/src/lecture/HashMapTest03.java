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
		// �̸� : key
		// �强ȣ, new Student(1, "010-1111-2222")
		// ����ȭ, 2, 010-2222-3333
		HashMap<String,Student> studentMap = new HashMap<>();
		studentMap.put("����ȭ", new Student(1,"010-1111-1111"));
		studentMap.put("�̼���", new Student(2,"010-2222-2222"));
		studentMap.put("�ֹ���", new Student(3,"010-3333-3333"));
		studentMap.put("������", new Student(4,"010-4444-4444"));
		Scanner scanner = new Scanner(System.in);
		Set<String> keys = studentMap.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String name = it.next();
//		while(true) {
//			System.out.println("�˻��� �̸��� ������.");
//			String name = scanner.nextLine();
//			if(name.equals("exit")) break;
			Student student = studentMap.get(name);
			if(student==null) System.out.println("�츮 �ݿ� �����.");
			else System.out.println(name+"���� ���̵�� "+student.getId()+"�̰� ��ȭ��ȣ�� "+student.getTel()+"�Դϴ�.");
		}		
		scanner.close();
	}
}
