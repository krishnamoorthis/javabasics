package com.inheritance;

public class Taxi extends Mconstructor {   //constructor chaining
	int i=100;
	 public Taxi(){
		//super(i);
		 System.out.println("empty 1 cons called");
	 }

	 public Taxi(int i){
		// super(i);
		//this();
		 System.out.println("one 1 cons called");
	 }
	 public Taxi(int i, int j){
		 super(i);
		//this();
		 System.out.println("two 2 cons called");
	 }
	
	@Override
	public void brake() {
		System.out.println("brake in car called");
	}

	public static void main(String[] args) {
	//	Taxi taxi1 = new Taxi(50,30);
	//	Taxi taxi = new Taxi();
    
        Mconstructor car =new Mconstructor();      //object subtitution
         car.brake();
         System.out.println(car.i);
         System.out.println(car instanceof  Mconstructor);
}
}