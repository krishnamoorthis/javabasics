package com.array;

public class Array {
	public static void main(String[] args) {
		int squares[] = new int [4];
		for (int i = 0; i < args.length; i++) {
		 squares[i] = i * 2;
			
		 
		 for (int j = 0; j < squares.length; j++) {
			System.out.println(args[i]);
		}
		}
		//squares[4]=30;
	}

}
