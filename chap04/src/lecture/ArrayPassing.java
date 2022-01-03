package lecture;

public class ArrayPassing {

	static void arrayIncrease(int array[]) {
		for(int i=0;i<array.length;i++) {
			array[i]++;
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
//		int arr02[] = new int[5];
		arrayIncrease(arr);
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
