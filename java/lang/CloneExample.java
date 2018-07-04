package com.java.lang;

import com.inheritance.Taxi;
import com.polymorphism.Car;

public class CloneExample implements Cloneable {
 	Car car;
	Taxi taxi;
	
	public CloneExample(){
		car = new Car();
		taxi = new Taxi();
	}
   public static void main(String[] args) {
	   try{
	   CloneExample ceone = new CloneExample();
	   CloneExample cetwo =(CloneExample) ceone.clone();
	   
	   System.out.println(ceone.car.hashCode() +" car hashcode "+cetwo.car.hashCode());
	   System.out.println(ceone.taxi.hashCode() +" taxi hashcode "+cetwo.taxi.hashCode());
	   System.out.println(ceone.hashCode() +"==="+cetwo.hashCode());
	   }catch (Exception e) {
	   e.printStackTrace();
	}
	 
		 
	 }
}

