package lecture;

public class MethodOverloading {
	// �޼��� �����ε��� �ż����� �̸��� ���� "�Ű������� ������ Ÿ��"�� �ٸ� ��..
	// ���� Ÿ���� ��� ����
	// �Լ��� ����..
	public int getSum(int a, int b) {
		return a + b;
	}
	public int getSum(int a, int b, int c) {
		return a + b + c;
	}
	public double getSum(double a, double b) {
		return a + b;
	}
//	public double getSum(int a, int b) {
//		return (double)(a + b);
//	}  -- ��������
}
