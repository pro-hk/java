package lecture;

// ���������� : class, field(�Ӽ�),
public class MethodOverloadingTest {

	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		int sum01 = mo.getSum(10, 10);
		System.out.println(sum01);
		int sum02 = mo.getSum(100, 200, 300);
		System.out.println(sum02);
		double sum03 = mo.getSum(3.14, 3.14);
		System.out.println(sum03);
		
		Circle aa = new Circle();
		Circle bb = new Circle();
		bb=aa;
		// bb�� ��� �Ǵ� �� -> ������ �÷����� ���� ����� �ȴ�.
		// ���� ����� �Ǵ� ���� ��, ��� ������� �ʴ´�.
		// ��ü�� �Ҵ��̳� null�� �������� �ȴ�.
		System.gc(); // �������� ȣ��
	}

}
