package lecture;

public class StringTest {   // String : �迭
	public static void main(String[] args) {
		String str01 = "abcd";
		char strList[] = {'a','b','c','d'};
		String str02 = new String(strList);
		String str03 = new String("abcd");
		String str04 = new String("   abcd			");
		String str05 = new String("a/b/cd");
		String subject = "ũ���������� ���������ϴ�. �츮�� �� 1�� 3�� ���� �ʴ� �ɱ��.....";
		
		System.out.println(str01.equals(str03));  // �񱳴� equals
		System.out.println(str01==str02);  // false
		System.out.println(str01.charAt(0)); // a
		System.out.println(str01.contains("ab")); // true  -- ���Կ���
		System.out.println(str01.contains("ac")); // false
		System.out.println(str01.length()); // 4
		System.out.println(str05.split("/")[2]); // cd  -- �ɰ��� �迭 ����
		System.out.println(str04.charAt(0));
		System.out.println(str04.trim().charAt(0));	// trim : ��ĭ ����
		System.out.println(str01+str02);
		System.out.println(str01.concat(str02)); // abcdabcd -- ���� ����
		System.out.println(subject.substring(0,10)+"...");
	}
}