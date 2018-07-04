package com.constructure;

public class Constructor {
	private int setSpeed;
	
	public void setSpeed(int s){
		this.setSpeed =s;
	}
		
		public Constructor(){
			System.out.println("cons called");
		}
		
	
public static void main(String[] args) {
	Constructor car1= new Constructor();
	Constructor car2= new Constructor();
	car1.setSpeed(50);
	car2.setSpeed(100);
	System.out.println(car1.setSpeed);
	System.out.println(car2.setSpeed);
}
}




