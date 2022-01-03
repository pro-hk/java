package practice;

public class Ex07 {
	public static void main(String[] args) {
		double sum=0;
		int arr[]=new int[10];
		System.out.print("·£´ýÇÑ Á¤¼öµé : ");
		for(int j=0;j<10;j++) {
			int i = (int)(Math.random()*10+1);
			arr[j]=i;
			sum += i;
			System.out.print(arr[j] +" ");
		}
		System.out.println();
		System.out.println("Æò±ÕÀº "+sum/10);
	}
}
