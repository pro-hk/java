package casting;

class Person{
	String name;
	String id;
	
	public Person(String name) {
		this.name = name;
	}
}
class Student extends Person{
	String grade;
	String department;
	
	public Student(String name) {
		super(name);
	}
}

public class UpcastingTest {
	public static void main(String[] args) {
		Person person;
		Student student = new Student("장혁");
		person = student;
		person.name = "장동건";
		System.out.println(person.name); 
		// upcasting : 위로 올라가기.. 타입 변환없이 바로 업캐스팅 가능
		
		Person person02 = new Student("이성규");
		Student student02;
		student02 = (Student)person02;
		// downcasting : 다운캐스팅은 반드시 타입 변환이 필요함
	}
}
