package lecture;

public interface PhoneInterface {
	final int TIMEOUT = 10000;  // ����� �빮�ڰ� ����
	public void sendCall();
	public void receiveCall();
	public default void printLogo() {   // default�� {}����
		System.out.println("---Phone---");
	}
}