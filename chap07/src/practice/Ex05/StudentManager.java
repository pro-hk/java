package practice.Ex05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentManager {
	private ArrayList<Student> university = new ArrayList<>();
	private Scanner scanner = new Scanner(System.in);
	// �� �Է�  record();
	private int total = 4;
	public void test() {
		String temp = "����,�ڹ�,1,4.0";
		StringTokenizer st = new StringTokenizer(temp,",");
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
	}
	private void record() {
		System.out.println("�л� �̸�, �а�, �й�, ������� �Է��ϼ���. ex) ����, �ڹ�, 1, 4.0");
		for(int i=0; i<total;i++) {
			System.out.print(">>");
			String studentInfo = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(studentInfo,",");
			String name = st.nextToken().trim();
			String department = st.nextToken().trim();
			int id = Integer.parseInt(st.nextToken().trim());
			double avg = Double.parseDouble(st.nextToken().trim());
			university.add(new Student(name, department, id, avg));
		}
	}
	// �л����� ���  printAll();
	private void printAll() {
		Iterator<Student> it = university.iterator();
		while(it.hasNext()) {
			Student student = it.next();
			System.out.println("-----------------------------------");
			System.out.println("�̸�:"+student.getName());
			System.out.println("�а�:"+student.getDepartment());
			System.out.println("�й�:"+student.getId());
			System.out.println("���:"+student.getAvg());
		}
	}
	// �л� ������ �ϳ� �о �̸�, �а�, ���̵�, ���  printOne();
	private void printOne() {
		System.out.println("-----------------------------------");
		while(true) {
			System.out.print("�л� �̸� >>");
			String name = scanner.next();
			if(name.equals("�׸�")) break;
			for(int i = 0; i<university.size();i++) {
				Student student = university.get(i);
				if(student.getName().equals(name)) {
					System.out.println(student.getName()+", "+student.getDepartment()+", "+student.getId()+", "+student.getAvg());
				}
			}
		}
	}
//	private String addZero(int num) {
//		if(num<10) return "0"+num;
//		else return ""+num;
//	}
	public void run() {
		record();
		printAll();
		printOne();
	}
}
