package lecture;

import java.io.BufferedOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class BufferedTest {
	public static void main(String[] args) {
		FileReader fileReader = null;
		int ch;
		try {
			fileReader = new FileReader("C:/Windows/Temp/test02.txt");  //12345678
			BufferedOutputStream bufOut = new BufferedOutputStream(System.out,5); // 5������ ���� �Ѿ��
			while(true) {
				ch = fileReader.read();
				if(ch==-1) break;
				bufOut.write(ch);
			}
			bufOut.flush(); // ������ �Ѿ��(������)
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
