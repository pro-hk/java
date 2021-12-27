package Exec2;

import java.util.Scanner;

public class Ex08 {
	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		if ((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("점 (x1,y1),(x2,y2)의 좌표를 입력하시오");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		if(inRect(x1,y1,0,0,200,100)&&y2<100) 
		   
		   {
			
		}
		scanner.close();
	}

}
