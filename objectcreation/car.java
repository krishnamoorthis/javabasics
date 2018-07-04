package com.objectcreation;

public class car {
          String model;
          double speed;    //instance variable
         // public car(){
        	  
        //  }
          public boolean start(){  // instance method
        	  return true;
          }
          public void accelerate(){
}
public static void main(String[] args) {
	car car1 = new car();
	car car2 = new car();
	car1.speed = 20.0;
	car2.speed = 30.0;
	System.out.println(car1.speed);
	System.out.println(car2.speed);
}
	
}