package lecture;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
		String query = "name=?强ȣ&age=20&weight=80";
		StringTokenizer st = new StringTokenizer(query,"&");
		System.out.println(st.countTokens());
//		System.out.println(st.nextToken());
//		System.out.println(query.split("&")[0]);
		while(st.hasMoreTokens()) {
		System.out.println(st.nextToken());
		}
//		System.out.println(st.nextToken());
	}
}
