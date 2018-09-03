package com.capgemini.day6;

import java.util.Comparator;
import java.util.TreeSet;

public class StudentMain {

	public static void main(String[] args) {
//		Comparator<Student1> rollNoComparator = (c1, c2) -> {
//			int result = Double.compare(c2.getRollNo(), c1.getRollNo());
//			return result;
//		};
		TreeSet<Student1> student = new TreeSet<>();
		
		 student.add(new Student1(1234,"ramu","cse"));
		 student.add(new Student1(2345,"seetha","ece"));
		 student.add(new Student1(4536,"raju","eee"));
		 student.add(new Student1(3536,"bindu","eee"));
		
		 
		 for (Student1 stu : student) {
			System.out.println(stu);
		}		 
	}

}
