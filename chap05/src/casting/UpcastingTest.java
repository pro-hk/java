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
		Student student = new Student("����");
		person = student;
		person.name = "�嵿��";
		System.out.println(person.name); 
		// upcasting : ���� �ö󰡱�.. Ÿ�� ��ȯ���� �ٷ� ��ĳ���� ����
		
		Person person02 = new Student("�̼���");
		Student student02;
		student02 = (Student)person02;
		// downcasting : �ٿ�ĳ������ �ݵ�� Ÿ�� ��ȯ�� �ʿ���
	}
}
