package com.inheritance;

public class Overrides extends Mconstructor {                
	 public Overrides(){
		//super(i);
		 System.out.println("empty 1 cons called");
	 }

	 public Overrides(int i){
		// super(i);
		//this();
		 System.out.println("one 1 cons called");
	 }
	 public Overrides(int i, int j){
		 super(i);
		//this();
		 System.out.println("two 2 cons called");
	 }
	  
	@Override
	public void brake() {
		System.out.println("brake in taxi called");
		//super.brake();
	}

	public static void main(String[] args) {
		Overrides taxi1 = new Overrides(50,30);
		Overrides taxi = new Overrides();
		taxi.brake();
	}


}