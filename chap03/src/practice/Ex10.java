package practice;

public class Ex10 {
	public static void main(String[] args) {
		int arr[][]=new int[4][4];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=(int)(Math.random()*10+1);
			}
		}
	}
}
