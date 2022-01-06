package lecture;

class SharedBoard {
	private int sum = 0;
	synchronized public void add() {
		int current = sum;
		Thread.yield();
		current += 10;
		sum = current;
		System.out.println(Thread.currentThread().getName() + " : " + sum);
	}
}

class StudentThread extends Thread{
	private SharedBoard board;
	public StudentThread(String name, SharedBoard board) {
		super(name);
		this.board = board;
	}
	
	public void run() {
		for(int i=0; i<10 ; i++) {
			board.add();
		}
	}
}

public class SysncTest {
	public static void main(String[] args) {
		SharedBoard sharedBoard = new SharedBoard();
		Thread student01 = new StudentThread("장재율",sharedBoard);
		Thread student02 = new StudentThread("이성규",sharedBoard);
		student01.start();
		student02.start();
	}
}
