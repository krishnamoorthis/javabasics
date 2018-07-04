package com.java.lang;

import java.lang.reflect.Constructor;

public class Rfl {
	
	
	public static void main(String[] args) {
		try {
		Class cls = Class.forName("com.java.lang.Employee");
		Constructor[] cons = cls.getDeclaredConstructors();
		} catch (Exception e) {
			
		}
	}

}
