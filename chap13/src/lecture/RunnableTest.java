package lecture;

class TimerRunnable implements Runnable{
	int num = 0;
	@Override
	public void run() {
		while(true) {
			System.out.println(num);
			num++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class RunnableTest {
	public static void main(String[] args) {
		Thread tr = new Thread(new TimerRunnable());
		tr.start();
	}
}
