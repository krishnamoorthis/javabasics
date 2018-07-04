package com.coditionsprogram;

public class SwitchString {
	public static void main(String[] args) {
		//int choice = 100;//if not match it go to default
		switch ("ajay") {
		case "kumar":
			System.out.println("kuamr");// ew can use number or string
			break;
        case "vijay":
        	System.out.println("vijay");
			break;
        case "anu":
        	System.out.println("anu");
	        break;
        case "ajay":
        	System.out.println("ajay");
	        break;
	        default:
	        	System.out.println(50);
			break;
		}
	}


}
