package com.capgemini.day06.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;

import com.capgemini.day6.Student;

class StudentTest {

	@Test
	void test() {
		LinkedList<Student> students = new LinkedList<>();
		 
		 students.add(new Student("ramu"));
		 students.add(new Student("ravi"));
		 students.add(new Student("seetha"));
		 
		 for(Student s : students) {
			 System.out.println(s);
		 }
	}

}
