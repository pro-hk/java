package lecture;

// 따로 부모생성자 함수를 호출하지 않으면 무조건 default 생성자를 찾아서 호출
// super() 통해서 호출하지 않으면 기본적으로 default 생성자를 호출한다.
class A {
	public A() {
		System.out.println("나는 A 생성자 함수");
	}
	public A(int x) {
		System.out.println("나는 "+x+"를 매개변수로 하는 생성자 함수 A");
	}
}
class B extends A{
	public B() {
		super();
		System.out.println("나는 B 생성자 함수");
	}
	public B(int x) {
		super(1); 
		// super() 메서드는 부모의 생성자 함수 호출 -- 만약 쓰지 않으면 super(); -> default 생성자 호출
		System.out.println("나는 "+x+"를 매개변수로 가지는 생성자 함수 B");
	}
}
class C extends B{
	public C() {
		System.out.println("나는 C 생성자 함수");
	}
}

public class ConstructorTest {
	public static void main(String[] args) {
		C c = new C();
		B b = new B(5);
	}
}
