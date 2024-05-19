package ch12;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex12_2 {
	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("java", 1, 2));
		list.add(new Student("python", 2, 2));
		list.add(new Student("javascript", 3, 2));

		Iterator<Student> it = list.iterator();
		while (it.hasNext()) {
			Student student = it.next();
			System.out.println(student.name);

		}

	}

}

class Student {
	String name = "";
	int ban;
	int no;

	public Student(String name, int ban, int no) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
	}

}
