package com.logic;

public class EncodingThreeStrings {
	
	public static void main(String[] args) {
		 String a[] = {"john","johny","janardhan"};
		 for (int i = 0; i < a.length; i++) {
			 int length=a[i].length();
			 if(length%3==0){
				 if(length==3){
					 String FRONT1=a[i].substring(0,1);
					 String MIDDLE1=a[i].substring(1,2);
					 String END1=a[i].substring(2,3);
					 System.out.println(FRONT1 +" "+MIDDLE1+" "+END1);
				 }
				  else if(length==6){
					 String FRONT1=a[i].substring(0,2);
					 String MIDDLE1=a[i].substring(2,4);
					 String END1=a[i].substring(4,6);
					 System.out.println(FRONT1 +" "+MIDDLE1+" "+END1);
					 
				 }
				  else if(length==9){
					 String FRONT1=a[i].substring(0,3);
					 String MIDDLE1=a[i].substring(3,6);
					 String END1=a[i].substring(6,9); 
					 System.out.println(FRONT1 +" "+MIDDLE1+" "+END1);
					 
				 }
			 }
			 else if(length%3==1){
				 String FRONT4=a[i].substring(0,1);
				 String MIDDLE4=a[i].substring(1,3);
				 String END4=a[i].substring(3,4);
				 System.out.println(FRONT4 +" "+MIDDLE4+" "+END4);
			 }
			 else if(length%3==2){
			 String FRONT5=a[i].substring(0,2);
			 String MIDDLE5=a[i].substring(2,3);
			 String END5=a[i].substring(3,5);
			 System.out.println(FRONT5 +" "+MIDDLE5+" "+END5);
			 }
		}
		 
		 
		
	}

}
