package com.inheritance;

public class Mconstructor {
public int setSpeed;
   public String model;
   int i=10;
	
   public Mconstructor() {
		// this(5,"a");
		System.out.println("empty cons called");
	}
	
     public Mconstructor(int s){
		//this();
		
		System.out.println("one cons called");
	}
	public Mconstructor(int s, String model){
		this.setSpeed=s;
		setSpeed++;
		
		System.out.println("two cons called");
	}
      
	 
	 public void brake(){
			
    	System.out.println("brake in car called");
    }


	
	
public static void main(String[] args) {
	
	//Mconstructor car1= new Mconstructor(50);
	//Mconstructor car2= new Mconstructor(100);
	
	//car1.setSpeed(50);
	//car2.setSpeed(100);
	
	//System.out.println(car1.setSpeed);
	//System.out.println(setSpeed);
}
}


