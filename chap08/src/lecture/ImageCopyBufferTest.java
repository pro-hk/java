package lecture;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopyBufferTest {
	public static void main(String[] args) {
		File src = new File("C:/Users/hyeok/Downloads/cat.jpg");
		File destSrc = new File("C:/Windows/Temp/copyCat.jpg");
		int ch;
		try {
			FileInputStream fileInput = new FileInputStream(src);
			FileOutputStream fileOutput = new FileOutputStream(destSrc);
			byte buffer[] = new byte[1024*10];
			/* ���۷� �б� */
			while(true) {
				ch = fileInput.read(buffer);
				fileOutput.write(buffer,0,ch);
				if(ch<buffer.length) break;
			}
//			while(true) {
//				ch = fileInput.read();
//				if(ch==-1) break;
//				fileOutput.write((byte)ch);
//			}
			fileOutput.close();
			fileInput.close();
			System.out.println(src.getPath()+"�� "+destSrc.getPath()+"�� �����Ͽ����ϴ�.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
