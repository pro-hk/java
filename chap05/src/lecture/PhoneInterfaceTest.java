package lecture;

public class PhoneInterfaceTest implements PhoneInterface {

	@Override
	public void sendCall() {
		System.out.println("�츮������������");
	}

	@Override
	public void receiveCall() {
		System.out.println("��ȭ �Ծ��...");
	}
	public void flash() {
		System.out.println("��ȭ�⿡ �ҵ���");
	}
	public static void main(String[] args) {
		PhoneInterfaceTest phone = new PhoneInterfaceTest();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		System.out.println(phone.TIMEOUT);
	}
}
