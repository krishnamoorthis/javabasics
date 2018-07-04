package com.thiskeyword;

public class CarThis {
	private int setSpeed;
	public void setSpeed(int s){
		this.setSpeed =s;
		
	}
public static void main(String[] args) {
	CarThis car1= new CarThis();
	CarThis car2= new CarThis();
	car1.setSpeed(50);
	car2.setSpeed(100);
	System.out.println(car1.setSpeed);
	System.out.println(car2.setSpeed);
}
}



