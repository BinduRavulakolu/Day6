package com.capgemini.day06.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;

import org.junit.jupiter.api.Test;

import com.capgemini.day6.Car;
import com.capgemini.day6.CellPhone;
import com.capgemini.day6.Laptop;
import com.capgemini.day6.School;
import com.capgemini.day6.Television;

class Collection2Test {

	@Test
	void testLaptop() {
	        HashSet<Laptop> laptops = new HashSet<>();
			
			assertEquals(true, laptops.add(new Laptop("Dell", "Inspiron5558", "Windows 8", "i5")));
			assertEquals(true, laptops.add(new Laptop("HP", "HP677", "Windows 10", "i3")));
			assertEquals(false, laptops.add(new Laptop("HP", "HP677", "Windows 10", "i7")));
	
	}
	@Test
	void testCar() {
	        HashSet<Car> cars = new HashSet<>();
			
			assertEquals(true, cars.add(new Car("Audi","Audi2018",2018,500000.00)));
			assertEquals(true, cars.add(new Car("Maruthi Suziki","suziki28",2017,250000.00)));
			assertEquals(true, cars.add(new Car("Hundai","hundai35",2018,350000.00)));
			assertEquals(false, cars.add(new Car("Hundai","hundai35",2085,35000.00)));
	}
	@Test
	void testTelevision() {
	        HashSet<Television> tv = new HashSet<>();
			
			assertEquals(true, tv.add(new Television("Samsung","LCD",true,25000.00)));
			assertEquals(true, tv.add(new Television("LG","Plasma",false,15000.00)));
			assertEquals(true, tv.add(new Television("Sony","LED",true,27000.00)));
			assertEquals(false, tv.add(new Television("LG","Plasma",false,15000.00)));
	}
	@Test
	void testCellPhone() {
	        HashSet<CellPhone> cp = new HashSet<>();
			
			assertEquals(true, cp.add(new CellPhone("Nokia","nokia120","Battery life is good","windows",15000.00)));
			assertEquals(true, cp.add(new CellPhone("samsung","samsungJ7","stoage space","Android",17000.00)));
			assertEquals(true, cp.add(new CellPhone("iphone","7s","camera is good","IOS",65000.00)));
			assertEquals(false, cp.add(new CellPhone("iphone","7s","camera is good","IOS",65000.00)));
	}
	@Test
	void testSchool() {
	        HashSet<School> s = new HashSet<>();
			
			assertEquals(true, s.add(new School("GHS","Hyderabad","rr Dist",3)));
			assertEquals(true, s.add(new School("DPS","Hyderabad","rr Dist",2)));
			assertEquals(true, s.add(new School("Oakridge","Hyderabad","rr Dist",1)));
			assertEquals(false,s.add(new School("Oakridge","Hyderabad","rr Dist",1)));
	}
	
	
}
