package lecture;

public class DoWhile {
	public static void main(String[] args) {
		// a~z
		char ch = 'a';
		do {
//			System.out.println("나는 dowhile입니다. 우선 한 번 실행합니다. 그리고 조건이 맞으면 반복문을 종료합니다.");
			System.out.print(ch);
			ch=(char)(ch+1);
		} while(ch <= 'z');
	}
}
