package lecture;

public class Person {
	private int weight;
	int age;  // default
	protected int height;
	public String name;
	
	public Person() {
		System.out.println("���� ���");
	}
	
	//getter setter   -- ���Ŀ� lombok ���̺귯�� ���ؼ� �ڵ����� ���� �� ����
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}
