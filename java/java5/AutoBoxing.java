package com.java.java5;

import com.polymorphism.Car;
import com.polymorphism.PoliceCar;
import com.polymorphism.SportsCar;
import com.polymorphism.TaxiCar;

public class AutoBoxing {
	public static void main(String[] args) {
		
		 Integer val1 = new Integer(10);
		  val1++;
		  int k = val1 + 20;
		  System.out.println(k);
		
	}
    public static void getItem(int count, Car...car){
    	for (int i = 0; i < car.length; i++) {
    		System.out.println(car[i]);
			
		}
    }
}
