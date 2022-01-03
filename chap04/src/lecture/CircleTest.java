package lecture;

public class CircleTest {
	
	static void increase(Circle circle) {
		circle.radius++;
	}
	
	// 객체를 할당하면 레퍼런스 참조, 기본타입의 변수는 복사됨
	public static void main(String[] args) {
		Circle pizza = new Circle();   // 객체 생성 -- (memory)heap에 올라감
		pizza.name = "새우피자";
		pizza.radius = 20;
		double area = pizza.getArea();
		System.out.println("피자의 이름은 "+pizza.name+"이고 반지름은 "+pizza.radius+"이고 면적은 "+area+"이다.");
		increase(pizza);
		System.out.println("pizza.radius==="+pizza.radius);
		
		Circle donut = new Circle();
		donut.name = "던킨";
		donut.radius = 10;
		double area01 = donut.getArea();
		System.out.println("도넛의 이름은 "+donut.name+"이고 반지름은 "+donut.radius+"이고 면적은 "+area01+"이다.");
		
		Circle02 circle02 = new Circle02();
//		circle02.radius = 10;
		double area02 = circle02.getArea();
		System.out.println(area02+"==="+circle02.name);
		
		Circle02 circle03 = new Circle02(50,"바퀴");
		double area03 = circle03.getArea();
		System.out.println(area03+"==="+circle03.name);
		
		Circle won;
		won = pizza;
		won.name = "동그라미";
		System.out.println(won.name+"==="+pizza.name);
		// 복사가 아니라 메모리에 있는 내용을 함께 참조
		
		int num = 3;
		int copyNum = num;
		copyNum =4;
		System.out.println(num+"==="+copyNum);
		
		Circle CircleArray[] = new Circle[5];
		for(int i=0;i<5;i++) {
			CircleArray[i] = new Circle(i+1);
			System.out.println(CircleArray[i].getArea());
		}
		// 객체도 배열에 담아서 쓸 수 있음 -- 객체배열
	}

}
