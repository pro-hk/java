package lecture;

// ���� �θ������ �Լ��� ȣ������ ������ ������ default �����ڸ� ã�Ƽ� ȣ��
// super() ���ؼ� ȣ������ ������ �⺻������ default �����ڸ� ȣ���Ѵ�.
class A {
	public A() {
		System.out.println("���� A ������ �Լ�");
	}
	public A(int x) {
		System.out.println("���� "+x+"�� �Ű������� �ϴ� ������ �Լ� A");
	}
}
class B extends A{
	public B() {
		super();
		System.out.println("���� B ������ �Լ�");
	}
	public B(int x) {
		super(1); 
		// super() �޼���� �θ��� ������ �Լ� ȣ�� -- ���� ���� ������ super(); -> default ������ ȣ��
		System.out.println("���� "+x+"�� �Ű������� ������ ������ �Լ� B");
	}
}
class C extends B{
	public C() {
		System.out.println("���� C ������ �Լ�");
	}
}

public class ConstructorTest {
	public static void main(String[] args) {
		C c = new C();
		B b = new B(5);
	}
}
