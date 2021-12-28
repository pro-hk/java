package lecture;

public interface PhoneInterface {
	final int TIMEOUT = 10000;  // 상수는 대문자가 관례
	public void sendCall();
	public void receiveCall();
	public default void printLogo() {   // default는 {}가능
		System.out.println("---Phone---");
	}
}