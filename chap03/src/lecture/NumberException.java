package lecture;

public class NumberException {

	public static void main(String[] args) {
		String strNum[] = {"23","12","3.14","100"};
		
//		for(int i=0;i<strNum.length;i++) {
//			try {
//				System.out.println(Integer.parseInt(strNum[i])); 				
//			} catch (NumberFormatException e) {
//				System.out.println(strNum[i]+"는 정수로 변환이 되지 않습니다.");
//			}
//		}
		int i = 0;
		try {
			for(i=0;i<strNum.length;i++) {
				int num = Integer.parseInt(strNum[i]);
				System.out.println("숫자로 바뀐 값은=="+num);
			}
		} catch (Exception e) {
			System.out.println(strNum[i]+"는 정수로 변환이 되지 않습니다.");
		}
	}

}
