package lecture;

import java.util.Scanner;

public class BookTest {
	
	public static void main(String[] args) {
		// ������ �����ε�
		Book littlePrince = new Book("�����","�����㺣��");
		// littlePrince.author = "Sang DDaggi"  -- ���氡��
		System.out.println(littlePrince.title+"==="+littlePrince.author);
		
		Book chunHyangJun = new Book("������");
		System.out.println(chunHyangJun.title+"==="+chunHyangJun.author);
		
		// �����ڰ� 1���� ������ default ������ �Ȼ���
		// Book slamdunk = new Book();
		
		Book noTitleBook = new Book();
		System.out.println(noTitleBook.title);
		
		noTitleBook.setName("��ֿ���");
		noTitleBook.getName();
		
		Book bookList[]= new Book[3];
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<bookList.length;i++) {
			System.out.println("������ ������");
			String title = scanner.nextLine();
			System.out.println("���ڸ� ������");
			String author = scanner.nextLine();
			bookList[i] = new Book(title,author);
		}
		for(int i=0;i<bookList.length;i++) {
			bookList[i].showBookInfo();
		}
		int n =10;
		bookList[2].methodTest(n);
		System.out.println("n���� 11�� �ٲ�������?"+"==="+n);
		scanner.close();
	}

}
