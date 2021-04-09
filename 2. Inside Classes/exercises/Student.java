package exercises;

import java.util.ArrayList;
import java.util.Iterator;

public class Student {
	private String name;
	int roll_no;
	
	public Student(String name, int roll_no) {
		this.name = name;
		this.roll_no = roll_no;
	}

	

	@Override
	public String toString() {
		return "Student [name=" + name + ", roll_no=" + roll_no + "]";
	}

	public static void main(String[] args) {
		Student stu1 = new Student("John", 2);
		Student stu2 = new Student("Sam", 3);
		
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(stu1);
		students.add(stu2);
		
		/*
		Iterator<Student> it = students.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		*/
		
		for (Student student : students) {
			System.out.println(student);
		}
		
	}
}
