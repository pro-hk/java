package lecture;

import java.util.Vector;

public class VectorTest {
	public static void main(String[] args) {
		// collection¿∫ π´¡∂∞« ∞¥√º∏∏
		Vector <Integer> vec = new Vector<Integer>();
		Vector <String> vec02 = new Vector<>();
		vec.add(1);
		vec.add(2);
		vec.add(3);
		vec.add(10);
		vec02.add("¿Â«ı");
		vec02.add("±Ë«ı");
		vec02.add("¿Ã«ı");
		vec02.add("π⁄«ı");
		vec02.add("¡§«ı");
		System.out.println(vec.capacity());
		System.out.println(vec02.capacity());
		for(int i=0;i<vec.size();i++) {
			System.out.println(vec.get(i));
		}
		vec.add(2,1000);
		for(int i=0;i<vec.size();i++) {
			System.out.println(vec.get(i));
		}
		for(int i=0;i<vec.size();i++) {
			System.out.println(vec02.get(i));
		}
	}
}
