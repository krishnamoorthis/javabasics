package com.logic;

import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		Scanner s1 =  new Scanner(System.in);
		String input = s1.nextLine().toUpperCase();
		
		int output=0;
		
		String arr[]=input.split(" ");
		for (int i = 0; i < arr.length; i++) {
			boolean result = arr[0].equals(arr[i]);
			
			if(result==true){
				output++;
			}
			
		}
		
         System.out.println(output);
	}

}
