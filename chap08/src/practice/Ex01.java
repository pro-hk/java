package practice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		FileWriter fileWriter = null;
		File phone = new File("C:/Windows/Temp/phone.txt");
		try {
			fileWriter = new FileWriter(phone);
			Scanner scanner = new Scanner(System.in);
			System.out.println("전화번호를 입력하시면 phone.txt에 저장됩니다.");
			while(true) {
				System.out.print("이름 전화번호 ex) 홍길동 == 010-1111-2222");
				String line = scanner.nextLine();
				if(line.equals("그만")) break;
				fileWriter.write(line+"\r\n");
			}
			scanner.close();
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
