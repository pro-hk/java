package practice.Ex05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class StudentManagerHashMap {
	private HashMap<String, Student> university = new HashMap<>();
	private Scanner scanner = new Scanner(System.in);
	// �� �Է� record();
	private int total = 4;

	public void test() {
		String temp = "����,�ڹ�,1,4.0";
		StringTokenizer st = new StringTokenizer(temp, ",");
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
	}

	private void record() {
		System.out.println("�л� �̸�, �а�, �й�, ������� �Է��ϼ���. ex) ����, �ڹ�, 1, 4.0");
		for (int i = 0; i < total; i++) {
			System.out.print(">>");
			String studentInfo = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(studentInfo, ",");
			String name = st.nextToken().trim();
			String department = st.nextToken().trim();
			int id = Integer.parseInt(st.nextToken().trim());
			double avg = Double.parseDouble(st.nextToken().trim());
			university.put(name, new Student(name, department, id, avg));
		}
	}

	// �л����� ��� printAll();
	private void printAll() {
		Set<String> keys = university.keySet();
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String name = it.next();
			Student student = university.get(name);
			System.out.println("-----------------------------------");
			System.out.println("�̸�:" + student.getName());
			System.out.println("�а�:" + student.getDepartment());
			System.out.println("�й�:" + student.getId());
			System.out.println("���:" + student.getAvg());
		}
	}

	// �л� ������ �ϳ� �о �̸�, �а�, ���̵�, ��� printOne();
	private void printOne() {
		System.out.println("-----------------------------------");
		while (true) {
			System.out.print("�л� �̸� >>");
			String name = scanner.next();
			if (name.equals("�׸�"))
				break;
			Student student = university.get(name);
			if(student==null) System.out.println("���� �л��Դϴ�.");
			else System.out.println(student.getName() + ", " + student.getDepartment() + ", " + student.getId() + ", "
					+ student.getAvg());
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
