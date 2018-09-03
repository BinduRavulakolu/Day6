package com.capgemini.day06.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.TreeSet;

import org.junit.jupiter.api.Test;

import com.capgemini.day6.Car;

class CarTest {

	@Test
	void testCar() {
		TreeSet<Car> car = new TreeSet<>();
		assertEquals(true,car.add(new Car("Audi","Audi2018",2018,500000.00)));
		assertEquals(true,car.add(new Car("Maruthi Suziki","suziki28",2017,250000.00)));
		assertEquals(true,car.add(new Car("Hundai","hundai35",2018,350000.00)));
		
		for (Car c : car) {
			System.out.println(c);
		}		 
	}

}
