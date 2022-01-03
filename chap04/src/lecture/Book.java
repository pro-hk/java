package lecture;

public class Book {
	// 제목과 작가
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
		System.out.println("생성자 호출됨");
	}
	
	public Book(String title) {
		// this : 자기자신(클래스), 부모 찾아갈 때 : super
		// 매개변수에 _ 추가해서 구분하기도 함
		this.title = title;
		author = "작자미상";
	}
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public void showBookInfo() {
		System.out.println("책 제목은 "+title+"이고, 작가는 "+author+"입니다.");
	}
	public void methodTest(int m) {
		System.out.println(++m);
	}
}
