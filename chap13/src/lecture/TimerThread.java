package lecture;

class MyTimer extends Thread {
	int num = 0;

	public void run() {
		while (true) {
			System.out.println(num);
			num++;
			try {
				sleep(1000);  // 1000(1초)마다 진행
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class TimerThread {

	public static void main(String[] args) {
		MyTimer myTimer = new MyTimer();
		myTimer.start();
	}
}
