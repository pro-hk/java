package lecture;

public class StringTest {   // String : 배열
	public static void main(String[] args) {
		String str01 = "abcd";
		char strList[] = {'a','b','c','d'};
		String str02 = new String(strList);
		String str03 = new String("abcd");
		String str04 = new String("   abcd			");
		String str05 = new String("a/b/cd");
		String subject = "크리스마스가 지나갔습니다. 우리는 왜 1월 3일 쉬지 않는 걸까요.....";
		
		System.out.println(str01.equals(str03));  // 비교는 equals
		System.out.println(str01==str02);  // false
		System.out.println(str01.charAt(0)); // a
		System.out.println(str01.contains("ab")); // true  -- 포함여부
		System.out.println(str01.contains("ac")); // false
		System.out.println(str01.length()); // 4
		System.out.println(str05.split("/")[2]); // cd  -- 쪼개서 배열 만듬
		System.out.println(str04.charAt(0));
		System.out.println(str04.trim().charAt(0));	// trim : 빈칸 삭제
		System.out.println(str01+str02);
		System.out.println(str01.concat(str02)); // abcdabcd -- 글자 연결
		System.out.println(subject.substring(0,10)+"...");
	}
}
