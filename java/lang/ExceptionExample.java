package com.java.lang;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.MalformedInputException;

public class ExceptionExample {
       public ExceptionExample(){
    	   try{
    	   int count = 10;
    	   double d = count/0;
    	   }catch (Exception e) {
			
		}
    	
    	   int c[]={1,2,3,4};
    	  // System.out.println(c[5]);
    	
    	   try{
    	    URL url = new URL("http://flipkart.com");
		     URLConnection connection = url.openConnection();
		     System.out.println("one");
    	   }catch (MalformedInputException e) {
    		 e.printStackTrace();
    		 System.out.println("two");
		}
    	   catch (Exception e) {
			e.printStackTrace();
		}
    	   finally{
    		   System.out.println("final ");
    	   }
    	   
       }
         public static void main(String[] args) {
			ExceptionExample ee = new ExceptionExample();
               try {
				ee.getCustomer();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			


		}
         public void getCustomer() throws MalformedInputException,IOException {
			//ExceptionExample ee = null;
			//ee.hashCode();
        	 URL u = new URL("http://google.com");
			
		}
}
