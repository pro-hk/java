package lecture;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopyTest {
	public static void main(String[] args) {
		File src = new File("C:/Users/hyeok/Downloads/dog.jpg");
		File destSrc = new File("C:/Windows/Temp/copyDog.jpg");
		int ch;
		try {
			FileInputStream fileInput = new FileInputStream(src);
			FileOutputStream fileOutput = new FileOutputStream(destSrc);
			while(true) {
				ch = fileInput.read();
				if(ch==-1) break;
				fileOutput.write((byte)ch);
			}
			System.out.println("복사가 완료되었습니다.");
			fileOutput.close();
			fileInput.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
