package lecture;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
	public static void main(String[] args) {
		byte b[] = {7,51,3,4,-1,24};
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("C:/Windows/Temp/test.out");
			for(int i=0;i<b.length;i++) {
				fileOutputStream.write(b[i]);
			}
			fileOutputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("저장하였습니다.");
	}
}
