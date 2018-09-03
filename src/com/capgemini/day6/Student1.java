package com.capgemini.day6;

import java.util.Comparator;

public class Student1 implements Comparable<Student1> {
	int rollNo;
	String name;
	String branch;
	
	public Student1()  {
		super();
	}
	
	public Student1(int rollNo, String name, String branch) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.branch = branch;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public int compareTo(Student1 o) {
//		int result = this.name.compareTo(o.name);
//		return result;
		return Integer.compare(this.rollNo,o.rollNo);
		}

	@Override
	public String toString() {
		return "Student1 [rollNo=" + rollNo + ", name=" + name + ", branch=" + branch + "]";
	}



//	@Override
//	public int compare(Object o1,Object o2) {
//		Integer i1=(Integer)o1;
//		Integer i2=(Integer)o2;
//		if(i1<i2)
//			return -1;
//		else if(i1>i2)
//			return +1;
//		else
//			return 0;
//		
//		
//	}


}
