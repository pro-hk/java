package lecture;

public class NumberException {

	public static void main(String[] args) {
		String strNum[] = {"23","12","3.14","100"};
		
//		for(int i=0;i<strNum.length;i++) {
//			try {
//				System.out.println(Integer.parseInt(strNum[i])); 				
//			} catch (NumberFormatException e) {
//				System.out.println(strNum[i]+"�� ������ ��ȯ�� ���� �ʽ��ϴ�.");
//			}
//		}
		int i = 0;
		try {
			for(i=0;i<strNum.length;i++) {
				int num = Integer.parseInt(strNum[i]);
				System.out.println("���ڷ� �ٲ� ����=="+num);
			}
		} catch (Exception e) {
			System.out.println(strNum[i]+"�� ������ ��ȯ�� ���� �ʽ��ϴ�.");
		}
	}

}
