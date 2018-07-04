package com.staticvariable;

public class Sta {
           static int count =10;
           static{
        	   count++;
        	   System.out.println("First static block"+count);
           }
           public Sta(){
        	   count++;
        	   System.out.println("cons"+count);
        	   
           }
           public void getItem(){
        	   count++;
        	   System.out.println("instance()"+count);
           }
           public static void getCus(){
        	   count++;
        	   System.out.println("static()"+count);
           }
           public static void main(String[] args) {
			Sta.count++;
			Sta.getCus();
			
			Sta Sta = new Sta();
			Sta.getItem();
			Sta.getCus();
			Sta.count++;
			System.out.println("value ="+count);
			
		}
           static{
           count++;
    	   System.out.println("second static block"+count);
           }
           
}
