package practice;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ex02 {
	public static void main(String[] args) {
		FileReader fileReader = null;
		File phone = new File("C:/Windows/Temp/phone.txt");
		try {
			fileReader = new FileReader(phone);
			int ch;
			while(true) {
				ch = fileReader.read();
				if(ch==-1) break;
				System.out.print((char)ch);
			}
			fileReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
