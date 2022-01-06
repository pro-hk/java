package lecture;

public class MainThreadTest {
	public static void main(String[] args) {
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		Thread.State state = Thread.currentThread().getState();
		System.out.println("현재 돌아가고 있는 Thread ID == "+id);
		System.out.println("현재 돌아가고 있는 Thread name == "+name);
		System.out.println("현재 돌아가고 있는 Thread Priority == "+priority); // 1~10
		System.out.println("현재 돌아가고 있는 Thread state == "+state);
		// 시작 : start();
		// 중지 : interrupt();    // while() - return; 
	}
}
