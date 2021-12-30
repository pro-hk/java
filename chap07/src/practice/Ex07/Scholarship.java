package practice.Ex07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Scholarship {
	private HashMap<String,Double> scoreMap = new HashMap<>();
	private Scanner scanner = new Scanner(System.in);
	
	private String title;

	public Scholarship(String title) {
		this.title = title;
	}
	// record
	private void record() {
		System.out.println(title+"�����ý����Դϴ�.");
		for(int i=0;i<5;i++) {
			System.out.print("�̸��� ����>> ");
			String name = scanner.next();
			double score = scanner.nextDouble();
			scoreMap.put(name, score);
		}
	}
	// select
	private void select() {
		System.out.print("���л� ���� ���� ���� �Է�>> ");
		double minScore = scanner.nextDouble();
		System.out.print("���л� ��� : ");
		Set<String> keys = scoreMap.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String name = it.next();
			double score = scoreMap.get(name);
			if(score>=minScore) {
				System.out.print(name+" ");
			}
		}
		System.out.println();
	}
	public void run() {
		record();
		select();
	}
}
