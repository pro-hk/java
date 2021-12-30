package lecture;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionTest {
	public static void main(String[] args) {
		LinkedList<String> movieList = new LinkedList<>();
		movieList.add("미나리");
		movieList.add("기생충");
		movieList.add("킹스맨");
		movieList.add("아바타");
		movieList.add("터미네이터");
		Collections.sort(movieList);    // 정렬
		Iterator<String> it = movieList.iterator();
		while(it.hasNext()) {
			String title = it.next();
			if(it.hasNext()) System.out.print(title+"=>");
			else System.out.println(title);
		}
		
		Collections.reverse(movieList);    // 뒤집기
		Iterator<String> it02 = movieList.iterator();
		while(it02.hasNext()) {
			String title = it02.next();
			if(it02.hasNext()) System.out.print(title+"=>");
			else System.out.println(title);
		}
		
		int idx = Collections.binarySearch(movieList, "킹스맨");
		System.out.println("킹스맨은 "+(idx+1)+"번째 영화입니다.");
	}
}
