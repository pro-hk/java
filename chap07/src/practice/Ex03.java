package practice;

import java.util.HashMap;
//import java.util.Iterator;
import java.util.Scanner;
//import java.util.Set;

public class Ex03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String,Integer> nations = new HashMap<>();
		System.out.println("���� �̸��� �α��� �Է��ϼ���.(��: Korea 5000)");
		while(true){
			System.out.print("���� �̸�, �α� >> ");
			String nation = scanner.next();   // �����ϸ� �Ѿ
			if(nation.equals("�׸�")) break;
			int num = scanner.nextInt();
			nations.put(nation, num);
		}
//		Set<String> keys = nations.keySet();
//		Iterator<String> it = keys.iterator();
//		while(it.hasNext()) {
//			String name = it.next();
//			System.out.println(name+"�� �α��� "+nations.get(name));
//		}
		while(true) {
			System.out.print("�α� �˻� >> ");
			String nation = scanner.next();
			if(nation.equals("�׸�")) break;
			Integer num = nations.get(nation);
			if(num==null) System.out.println(nation+" ����� �����ϴ�.");
			else System.out.println(nation+"�� �α��� "+num);
		}
		scanner.close();
	}
}
