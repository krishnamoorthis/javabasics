package com.wipro;

import java.util.Scanner;

public class Volume {
	static double width;
	static double height;
	static double depth;
	


	
	public double Volume( double width, double height, double depth){
		
		double Volume = width*height*depth;
		return Volume;
	}
	
	
	
	
	public static void main(String[] args) {
		
		Volume v1 = new Volume();
		
		Scanner vo = new Scanner(System.in);
		
		double width = vo.nextDouble();
		double height = vo.nextDouble();
		double depth = vo.nextDouble();
		
		v1.Volume(width, height, depth);
		
		
	}

}
