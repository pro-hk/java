package lecture;

public class Circle02 {
	int radius;
	String name;
	
	// constructor(������)�� return Ÿ���� ����
	// �������Լ�(method�̸�, �̸��� ���ƾ���)
	// ������ �ۼ��� ����(�����ε�)
	// new�� ���� ��ü�� ������ �� �ѹ� ȣ��
	// �ʱ�ȭ
	// ���� ���� ������ compiler�� �ڵ����� �ϳ� ���� ���� ����(default constructor)
	public Circle02() {
		radius = 1;
	}
	public Circle02(int r, String n) {
		radius = r;
		name = n;
	}
	public double getArea() {
		return radius*radius*3.14;
	}
}
