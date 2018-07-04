package com.inheritance;

public class ThreeDimensionalShape extends Shape {
	
	
	
	
	
	
	
	
	@Override
	public void printshape(String shape) {
		// TODO Auto-generated method stub
		System.out.println(shape);
	}

	public static void main(String[] args) {
		
		
		ThreeDimensionalShape s2 = new ThreeDimensionalShape();
		        s2.printshape("sphere");
	}

}
