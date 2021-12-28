package lecture;

class Weapon{
	protected int fire() {
		return 1;
	}
}
class Cannon extends Weapon{
	@Override
	protected int fire() {
		return 10;
	}
}

public class OverrideTest {
	public static void main(String[] args) {
		Weapon weapon = new Weapon();
		System.out.println("�⺻ ������ �������� "+weapon.fire()+"�Դϴ�.");
		Weapon cannon = new Cannon();
		System.out.println("���׷��̵� ������ �������� "+cannon.fire()+"�Դϴ�.");
	}
}
