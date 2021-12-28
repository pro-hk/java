package lecture;

public class Person {
	private int weight;
	int age;  // default
	protected int height;
	public String name;
	
	public Person() {
		System.out.println("나는 사람");
	}
	
	//getter setter   -- 추후에 lombok 라이브러리 통해서 자동으로 만들 수 있음
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}
