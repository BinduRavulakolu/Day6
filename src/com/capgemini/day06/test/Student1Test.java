package com.capgemini.day06.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.TreeSet;

import org.junit.jupiter.api.Test;

import com.capgemini.day6.Student1;

class Student1Test {

	@Test
	void testStudent1() {
		TreeSet<Student1> student = new TreeSet<>();
		
		assertEquals(true,student.add(new Student1(1234,"ramu","cse")));
		assertEquals(true,student.add(new Student1(2345,"seetha","ece")));
		assertEquals(true,student.add(new Student1(4536,"raju","eee")));
		assertEquals(true,student.add(new Student1(3536,"bindu","eee")));
		
		 
		 for (Student1 stu : student) {
			System.out.println(stu);
		}		 
	}

}
