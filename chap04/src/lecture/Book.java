package lecture;

public class Book {
	// ����� �۰�
	String title;
	String author;
	
	// alt + shift + s --> getter & setter
	
	private String name;
	private int age;
	private String address;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Book() {
		this("notitle","noname");
		System.out.println("������ ȣ���");
	}
	
	public Book(String title) {
		// this : �ڱ��ڽ�(Ŭ����), �θ� ã�ư� �� : super
		// �Ű������� _ �߰��ؼ� �����ϱ⵵ ��
		this.title = title;
		author = "���ڹ̻�";
	}
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public void showBookInfo() {
		System.out.println("å ������ "+title+"�̰�, �۰��� "+author+"�Դϴ�.");
	}
	public void methodTest(int m) {
		System.out.println(++m);
	}
}
