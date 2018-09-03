package com.capgemini.day06.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

class FruitsTest {
	String[] fruits;

	@Test
	void testStuentFavoriteFruit() {
		HashMap<String,ArrayList<String>> favoritefruit=new HashMap<>();
		fruits=new String[] {"apple","mango","banana"};
		favoritefruit.put("Ramu",new ArrayList<String>(Arrays.asList(fruits)));
		fruits=new String[] {"orange","guava","banana"};
		favoritefruit.put("Seetha",new ArrayList<String>(Arrays.asList(fruits)));
	
		
		for(Map.Entry<String,ArrayList<String>> entry :favoritefruit.entrySet())
		{
			System.out.println("key = "+entry.getKey()+",value = "+entry.getValue());
		}
		
	}

}
