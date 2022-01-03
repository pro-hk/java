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
		System.out.println("기본 무기의 데미지는 "+weapon.fire()+"입니다.");
		Weapon cannon = new Cannon();
		System.out.println("업그레이드 무기의 데미지는 "+cannon.fire()+"입니다.");
	}
}
