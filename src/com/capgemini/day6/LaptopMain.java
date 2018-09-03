package com.capgemini.day6;

import java.util.HashSet;

public class LaptopMain {

	public static void main(String[] args) {
		HashSet<Laptop> details = new HashSet<>();
		 
		 details.add(new Laptop("Dell", "Inspiron5558", "Windows 8", "i5"));
		 details.add(new Laptop("HP", "HP677", "Windows 10", "i3"));
		 details.add(new Laptop("HP", "HP677", "Windows 10", "i7"));
		 
		 for(Laptop l : details) {
			 System.out.println(l);
		 }
	}

}
