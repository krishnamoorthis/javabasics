package com.datastructure;

import java.util.Hashtable;
import java.util.Vector;


public class OldDS {
      public static void main(String[] args) {
		Vector vec = new Vector();
		
		vec.add(12);
		vec.add("hai");
		vec.add(12.67);
		
		Double dou=(Double)vec.get(2);
		Integer inte=(Integer)vec.get(0);
		System.out.println("---------VECTOR--------");
		System.out.println(dou);
		System.out.println(inte);
		
		Vector<String> vtrstr= new Vector<String>();   //vector 
		vtrstr.add("one");
		vtrstr.add("two");
		
		String s=vtrstr.get(0);
		System.out.println(s);
		
		System.out.println("------HASHTABLE-----------");
		
		Hashtable<Integer, String> ht = new Hashtable<>();     //Hash Table
		ht.put(4, "gowtham");
		ht.put(7, "krish");
		
		String i = ht.get(7);
		System.out.println(i);
				
		
		
	}
}
