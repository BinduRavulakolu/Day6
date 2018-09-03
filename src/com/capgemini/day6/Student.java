package com.capgemini.day6;

public class Student 
{
	String name;

	public Student() {
		super();
		
	}
	public Student(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student name:" + name;
	}
	

	
}
