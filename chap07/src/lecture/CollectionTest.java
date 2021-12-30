package lecture;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionTest {
	public static void main(String[] args) {
		LinkedList<String> movieList = new LinkedList<>();
		movieList.add("�̳���");
		movieList.add("�����");
		movieList.add("ŷ����");
		movieList.add("�ƹ�Ÿ");
		movieList.add("�͹̳�����");
		Collections.sort(movieList);    // ����
		Iterator<String> it = movieList.iterator();
		while(it.hasNext()) {
			String title = it.next();
			if(it.hasNext()) System.out.print(title+"=>");
			else System.out.println(title);
		}
		
		Collections.reverse(movieList);    // ������
		Iterator<String> it02 = movieList.iterator();
		while(it02.hasNext()) {
			String title = it02.next();
			if(it02.hasNext()) System.out.print(title+"=>");
			else System.out.println(title);
		}
		
		int idx = Collections.binarySearch(movieList, "ŷ����");
		System.out.println("ŷ������ "+(idx+1)+"��° ��ȭ�Դϴ�.");
	}
}
