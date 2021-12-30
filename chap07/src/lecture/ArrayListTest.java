package lecture;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListTest {
	// ������.. ��Ƽ������..
	// Map: key:value  --  �������� ��  -- put(key,value) / get(key)
	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		// while�� �ٲ㼭 �Է��� �̸��� �׸� ������ ���������� �Է��� �̸��� ����ϱ�
		// while(true){   -- for�� true�� ����
		for(int i=0;true;i++) {
			System.out.println("�̸��� �Է��ϼ���.");
			String name = scanner.nextLine();
			if(name.equals("�׸�")) break;
			strList.add(name);
		}
		for(int i=0;i<strList.size();i++) {
			String name = strList.get(i);
			System.out.print(name+"/");
		}
		// ���� �� �̸� ����غ���
		int longIdx = 0;
		for(int i=0;i<strList.size();i++) {
			if(strList.get(longIdx).length()<strList.get(i).length()) {
				longIdx = i;
			}
		}
		System.out.println("���� �� �̸��� === "+strList.get(longIdx));
		// Vector, ArrayList : ��ȯ����(iterable)
		Iterator<String> it = strList.iterator();
		System.out.println(it.hasNext());
		while(it.hasNext()) {
			System.out.print(it.next()+"/");
		}
		scanner.close();
	}
}
