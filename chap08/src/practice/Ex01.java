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
			System.out.println("��ȭ��ȣ�� �Է��Ͻø� phone.txt�� ����˴ϴ�.");
			while(true) {
				System.out.print("�̸� ��ȭ��ȣ ex) ȫ�浿 == 010-1111-2222");
				String line = scanner.nextLine();
				if(line.equals("�׸�")) break;
				fileWriter.write(line+"\r\n");
			}
			scanner.close();
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
