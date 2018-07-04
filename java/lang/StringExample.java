package com.java.lang;

public class StringExample {
	public StringExample(){
		
	}
	public static void main(String[] args) {
		 String one =  "Good";                      //string literal
		 String objone = new  String ("Good");  //string object
		 
		 String two = "Good";
		 System.out.println(one == two);
		 
		 System.out.println(one.equals(two));
		 System.out.println(one.hashCode());
		 one = one + "bad";
		 System.out.println(one);
		 System.out.println(one.hashCode());
		  
		 String s = "this,is,an,example";
		 String ss[] = s.split(",");
		 for (int i = 0; i < ss.length; i++) {
			 System.out.println(ss[i]);
			 
		 }
			 StringBuffer ss1 = new StringBuffer();
			 ss1.append("abc");
			 ss1.append("def");
			 ss1.append("ghi");
			 System.out.println(ss1);
			
		}
		 
	}


