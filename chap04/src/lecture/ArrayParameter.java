package lecture;

public class ArrayParameter {
	
	static void replaceSpace(char chList[]) {
		for(int i=0;i<chList.length;i++) {
			if(chList[i]==' ') {
				chList[i]=',';
			}
		}
	}
	
	static void printCharList(char chList[]) {
		for(int i=0;i<chList.length;i++) {
			System.out.print(chList[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		char chList[] = {'m','e','r','r','y',' ','c','h','r','i','s','t',' ','m','a','s'};
		printCharList(chList);
		replaceSpace(chList);
		printCharList(chList);
	}

}
