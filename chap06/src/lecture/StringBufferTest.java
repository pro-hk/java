package lecture;

public class StringBufferTest {
	public static void main(String[] args) {
//		select * from member;  sql -- DB에서 데이터 가져올 때 사용하는 명령어
		// stringbuffer는 string과 비슷 -- 가변 길이를 제공(string+string+..)
		String str01 = new String("String");
		StringBuffer sb = new StringBuffer("a");
		sb.append(" pencil");
		sb.insert(2, "good ");
		System.out.println(sb);
	}
}
