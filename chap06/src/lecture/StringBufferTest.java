package lecture;

public class StringBufferTest {
	public static void main(String[] args) {
//		select * from member;  sql -- DB���� ������ ������ �� ����ϴ� ���ɾ�
		// stringbuffer�� string�� ��� -- ���� ���̸� ����(string+string+..)
		String str01 = new String("String");
		StringBuffer sb = new StringBuffer("a");
		sb.append(" pencil");
		sb.insert(2, "good ");
		System.out.println(sb);
	}
}