package lecture;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapTest02 {
	// gson : HashMap -> json
	// 코로나 [{aa:10},{aa:30},{aa:100}]
	public static void main(String[] args) {
		HashMap<String,Integer> score = new HashMap<>();
		score.put("이중화", 50);
		score.put("최문성", 70);
		score.put("이성규", 80);
		score.put("심재훈", 85);
		System.out.println(score.size());
		Set<String> keys = score.keySet();  // Set은 반복을 허용하지 않는다
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String name = it.next();
			int num = score.get(name);
			System.out.println(name+":"+num);
		}
	}
}
