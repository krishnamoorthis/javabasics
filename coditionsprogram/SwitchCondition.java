package com.coditionsprogram;

public class SwitchCondition {
	public static void main(String[] args) {
		int choice = 100;//if not match it go to default
		switch (choice) {
		case 10:
			System.out.println(10);
			break;
        case 20:
        	System.out.println(20);
			break;
        case 30:
        	System.out.println(30);
	        break;
        case 40:
        	System.out.println(40);
	        break;
	        default:
	        	System.out.println(50);
			break;
		}
	}

}
