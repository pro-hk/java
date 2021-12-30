package lecture;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapTest02 {
	// gson : HashMap -> json
	// �ڷγ� [{aa:10},{aa:30},{aa:100}]
	public static void main(String[] args) {
		HashMap<String,Integer> score = new HashMap<>();
		score.put("����ȭ", 50);
		score.put("�ֹ���", 70);
		score.put("�̼���", 80);
		score.put("������", 85);
		System.out.println(score.size());
		Set<String> keys = score.keySet();  // Set�� �ݺ��� ������� �ʴ´�
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String name = it.next();
			int num = score.get(name);
			System.out.println(name+":"+num);
		}
	}
}
