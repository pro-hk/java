package casting;

class Person01{}
class Student01 extends Person01{}
class Researcher extends Person01{}
class Professor extends Researcher{}

// Collection List Set Map  -- ArrayList HashMap

public class InstanceOfTest {
	static void printPerson(Person01 p) {
		if(p instanceof Person01) {
			System.out.println("Person01");
		}
		if(p instanceof Student01) {
			System.out.println("Student01");
		}
		if(p instanceof Researcher) {
			System.out.println("Researcher");
		}
		if(p instanceof Professor) {
			System.out.println("Professor");
		}
	}
	
	public static void main(String[] args) {
		System.out.print("new Student01()===>");
		printPerson(new Student01());
		System.out.print("new Professor()===>");
		printPerson(new Professor());
	}
}
