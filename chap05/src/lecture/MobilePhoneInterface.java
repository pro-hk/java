package lecture;

// 인터페이스끼리는 상속 가능
public interface MobilePhoneInterface extends PhoneInterface {
	public void sendSMS();
	public void receiveSMS();
}
