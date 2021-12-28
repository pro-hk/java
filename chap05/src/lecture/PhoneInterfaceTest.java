package lecture;

public class PhoneInterfaceTest implements PhoneInterface {

	@Override
	public void sendCall() {
		System.out.println("띠리리리리리리링");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화 왔어요...");
	}
	public void flash() {
		System.out.println("전화기에 불들어옴");
	}
	public static void main(String[] args) {
		PhoneInterfaceTest phone = new PhoneInterfaceTest();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		System.out.println(phone.TIMEOUT);
	}
}
