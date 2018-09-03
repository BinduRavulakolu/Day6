package com.capgemini.day06.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.capgemini.day6.Car;
import com.capgemini.day6.CellPhone;
import com.capgemini.day6.Laptop;
import com.capgemini.day6.School;
import com.capgemini.day6.Television;

class CollectionTest {

	@Test
	void testLaptop() {
        ArrayList<Laptop> laptops = new ArrayList<>();
		
		assertEquals(true, laptops.add(new Laptop("Dell", "Inspiron5558", "Windows 8", "i5")));
		laptops.add(new Laptop("HP", "HP234", "Windows 10", "i3"));
		laptops.add(new Laptop("HP", "HP677", "Windows 10", "i7"));
		
		assertEquals(3, laptops.size());
	}
    @Test
    void testCar()
    {
    	ArrayList<Car> cars=new ArrayList<>();
    	assertEquals(true,cars.add(new Car("Audi","Audi2018",2018,500000.00)));
    	cars.add(new Car("Maruthi Suziki","suziki28",2017,250000.00));
    	cars.add(new Car("Hundai","hundai35",2018,350000.00));
    	
    	
    	assertEquals(3,cars.size());
    }
    @Test
    void testTelevision()
    {
    	ArrayList<Television> tv=new ArrayList<>();
    	tv.add(new Television("Samsung","LCD",true,25000.00));
    	tv.add(new Television("Sony","LED",true,27000.00));
    	tv.add(new Television("LG","Plasma",false,15000.00));
    	
    	
    	assertEquals(3, tv.size());
    	
}
    @Test
    void testCellPhone()
    {
    	ArrayList<CellPhone> phone=new ArrayList<>();
    	phone.add(new CellPhone("Nokia","nokia120","Battery life is good","windows",15000.00));
    	phone.add(new CellPhone("samsung","samsungJ7","stoage space","Android",17000.00));
    	phone.add(new CellPhone("iphone","7s","camera is good","IOS",65000.00));
    	
    	
    	assertEquals(3, phone.size());
    	
}
    @Test
    void testSchool()
    {
    	ArrayList<School> school=new ArrayList<>();
    	school.add(new School("GHS","Hyderabad","rr Dist",3));
    	school.add(new School("DPS","Hyderabad","rr Dist",2));
    	school.add(new School("Oakridge","Hyderabad","rr Dist",1));
    	
    	
    	assertEquals(3, school.size());
    	
}
    
}
