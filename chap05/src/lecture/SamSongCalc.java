package lecture;

public class SamSongCalc extends Calculator {

	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		int result = a > b ? a - b : b - a;
		return result;
	}

	@Override
	public double avg(int[] arr) {
		double sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		return sum/arr.length;
	}
	public static void main(String[] args) {
		SamSongCalc sc = new SamSongCalc();
		System.out.println(sc.add(10, 20));
		System.out.println(sc.subtract(23, 78));
		System.out.println(sc.avg(new int[] {98,95,87}));
	}
}
