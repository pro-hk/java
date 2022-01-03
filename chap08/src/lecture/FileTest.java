package lecture;

import java.io.File;

public class FileTest {
	public static void main(String[] args) {
		File file = new File("C:/Windows/Temp/system.ini");
		System.out.println(file.getPath());
		System.out.println(file.getParent());
		System.out.println(file.getName());
		String isFile = null;
		if(file.isFile()) isFile = "파일";
		else isFile = "폴더";
		System.out.println(isFile);
		File sampleFolder = new File("C:/Windows/Temp/sample");
		System.out.println(sampleFolder.getPath()+"의 하위 폴더 및 파일 리스트 입니다.");
		File subFiles[] = sampleFolder.listFiles();
		for(int i=0;i<subFiles.length;i++) {
			File file02 = subFiles[i];
			System.out.println(file02.getName()+"=== 파일 용량 "+file02.length()/1024+"kb");
		}
	}
}
