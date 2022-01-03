package lecture;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// 내보내기
public class Chap0803 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter("C:/Windows/Temp/test.txt");
			while(true) {
				String line = scanner.nextLine();
				if(line.length()==0) break;
				fileWriter.write(line,0,line.length());
				fileWriter.write("\r\n",0,2);
			}
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		scanner.close();
	}
}
