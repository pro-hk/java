package lecture;

public class Student extends Person {
	public Student() {
		System.out.println("나는 Person을 상속받은 학생 클래스");
	}
	
	public void set() {
		age = 30;
		setWeight(80);
		name = "장혁";
		height = 180;
	}
}
