package com.capgemini.day6;

import java.util.TreeSet;

public class CarMain {

	public static void main(String[] args) {
		TreeSet<Car> car = new TreeSet<>();
		car.add(new Car("Audi","Audi2018",2018,500000.00));
		car.add(new Car("Maruthi Suziki","suziki28",2017,250000.00));
		car.add(new Car("Hundai","hundai35",2018,350000.00));
		
		for (Car c : car) {
			System.out.println(c);
		}		 

	}

}
