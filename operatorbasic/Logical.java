package com.operatorbasic;

public class Logical {
	public static void main(String[] args) {
		boolean istrue = false;
		System.out.println(!istrue);
		int value = 1000;
		System.out.println( value > 1000 & istrue);
		System.out.println( value < 1000|istrue);
		System.out.println( value >= 1000^istrue);
		
	}

}
