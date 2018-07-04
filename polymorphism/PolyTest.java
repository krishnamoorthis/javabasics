package com.polymorphism;

public class PolyTest {
	
	
	    public static void main(String[] args) {
			
	    	
	    	PolyTest pt = new PolyTest();
	    	PoliceCar pc = new PoliceCar();
	    	SportsCar sc = new SportsCar();
	    	TaxiCar taxi = new TaxiCar();	 
	    	
	    	pt.brake(sc);
	    	pt.brake(pc);
	    	pt.brake(taxi);
	    	
	    	Car car[]={new TaxiCar(),new PoliceCar(),new SportsCar()};
	    	for (int i = 0; i < car.length; i++) {
	    		car[i].brake();
				
			}
	    	
		}
       
	    public void brake (Car car){ 
	    	car.brake();
	    	
	    }
	    
}
