package lecture;

public class MainThreadTest {
	public static void main(String[] args) {
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		Thread.State state = Thread.currentThread().getState();
		System.out.println("���� ���ư��� �ִ� Thread ID == "+id);
		System.out.println("���� ���ư��� �ִ� Thread name == "+name);
		System.out.println("���� ���ư��� �ִ� Thread Priority == "+priority); // 1~10
		System.out.println("���� ���ư��� �ִ� Thread state == "+state);
		// ���� : start();
		// ���� : interrupt();    // while() - return; 
	}
}
