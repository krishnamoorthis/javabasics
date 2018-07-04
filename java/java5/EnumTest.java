package com.java.java5;

public class EnumTest {
	public static void main(String[] args) {
		Level level = Level.HIGH;
		System.out.println(level.getClass().getName());
		System.out.println(level.name());  //it give constant name 
		System.out.println(level.ordinal()); //it give index of the value
		System.out.println(level.levelcode); 
		System.out.println(level.getlevelcode()); 
		Level levelone[] = level.values();
		for (int i = 0; i < levelone.length; i++) {
			System.out.println(levelone);
			
		}
		
	
	
	}

}
