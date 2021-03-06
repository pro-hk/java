package lecture;

public class WrapperTest {
	public static void main(String[] args) {
		char ch01 = 'A';
		char ch02 = '4';
		char ch03 = 'F';
		String num = "10";
		
		Integer ten = 10; // Boxing
		int intTen = ten; // unboxing
		
		System.out.println(Character.toLowerCase(ch01)); // a
		System.out.println(num+10); // 1010
		System.out.println(Integer.parseInt(num)+10);  //20
		System.out.println(Character.isDigit(ch02)); // 숫자냐? true
		
		int num02 = 10;
		Integer num02Obj = num02;  // boxing
		System.out.println("num02Obj=="+num02Obj);
		int sum = 10 + num02Obj;  // unboxing
		System.out.println("sum=="+sum);
	}
}

// 속성 -- Wrapper
// int -- Integer
// char -- Character
