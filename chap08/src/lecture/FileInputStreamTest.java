package lecture;

import java.io.FileInputStream;
import java.io.IOException;

//버퍼를 다는 이유 : 고속으로 파일 읽기, 쓰기를 하기 위해..
public class FileInputStreamTest {
	public static void main(String[] args) {
		byte b[] = new byte[6];
		try {
			FileInputStream fileInput = new FileInputStream("C:/Windows/Temp/test.out");
			int count=0;
			int ch=0;
			while(true) {
				ch=fileInput.read();
				if(ch==-1) break;
				b[count]=(byte)ch;
				count++;
			}
			for(int i=0;i<b.length;i++) {
				System.out.print(b[i]+",");
			}
			fileInput.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
