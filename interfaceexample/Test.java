package com.interfaceexample;

public class Test{
     
	    public static void main(String[] args) {
			Travel TravelOne = new Car();
			Travel TravelTwo = new Dog();
			
			System.out.println(TravelTwo instanceof Dog);
			
			Travel travelthree = new Rabbit();
			Owner owner = (Owner)travelthree;
			
		}

}
