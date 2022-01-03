package lecture;

// 접근제한자 : class, field(속성),
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
		// bb는 없어도 되는 것 -> 가비지 컬렉션의 수거 대상이 된다.
		// 수거 대상이 되는 것일 뿐, 즉시 사라지지 않는다.
		// 객체의 할당이나 null은 가비지가 된다.
		System.gc(); // 쓰레기차 호출
	}

}
