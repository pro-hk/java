package lecture;

import java.io.FileReader;
import java.io.IOException;

public class Chap0801 {
	public static void main(String[] args) {
		// ���� �б� -- IO�� ��κ� Exception�� �߻���
		try {
			FileReader fileReader = new FileReader("C:/Windows/system.ini");
			int ch;
			while((ch = fileReader.read()) != -1) { //-1�� ������ ��
				System.out.print((char)ch);
			}
			/*
			 while(true){
			 ch = fileReader.read();
			 if(ch==-1) break;
			 System.out.print((char)ch);
			 */
			fileReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
