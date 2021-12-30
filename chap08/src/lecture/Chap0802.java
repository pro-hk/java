package lecture;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chap0802 {
	public static void main(String[] args) {
		try {
			//파일 읽기..
			FileInputStream fileInputStream = new FileInputStream("C:/Windows/Temp/seosi.txt");
			InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream,"UTF-8");
			int ch;
			while(true) {
				ch = inputStreamReader.read();
				if(ch==-1) break;
				System.out.print((char)ch);
			}
			inputStreamReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
