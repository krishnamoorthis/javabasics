package com.polymorphism;

public class FinalKeyword {
	int i=29;
	
	public static void main(String[] args) {
		
		final int count = 10;    //final variable
		//count++;
		
		final FinalKeyword t1 = new FinalKeyword();// final kw in object we can change the value of variable 
		t1.i=50;
		//t1= new FinalKeyword();//but cannot re assign new object
		
	}

}


//if we use in class after we can't create the sub class
//if we use in method after we can't override the sub method