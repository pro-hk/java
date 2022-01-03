package practice.Ex05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentManager {
	private ArrayList<Student> university = new ArrayList<>();
	private Scanner scanner = new Scanner(System.in);
	// 값 입력  record();
	private int total = 4;
	public void test() {
		String temp = "장혁,자바,1,4.0";
		StringTokenizer st = new StringTokenizer(temp,",");
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
	}
	private void record() {
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요. ex) 장혁, 자바, 1, 4.0");
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
	// 학생정보 출력  printAll();
	private void printAll() {
		Iterator<Student> it = university.iterator();
		while(it.hasNext()) {
			Student student = it.next();
			System.out.println("-----------------------------------");
			System.out.println("이름:"+student.getName());
			System.out.println("학과:"+student.getDepartment());
			System.out.println("학번:"+student.getId());
			System.out.println("평균:"+student.getAvg());
		}
	}
	// 학생 데이터 하나 읽어서 이름, 학과, 아이디, 평균  printOne();
	private void printOne() {
		System.out.println("-----------------------------------");
		while(true) {
			System.out.print("학생 이름 >>");
			String name = scanner.next();
			if(name.equals("그만")) break;
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
