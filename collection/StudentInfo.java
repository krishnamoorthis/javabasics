package com.collection;

import java.util.Arrays;
import java.util.Comparator;

public class StudentInfo {
	
	public static void main(String[] args) {
		
	
	  
		Student s1= new Student(1, "krish", 1000);
	    Student s2 = new Student(2, "arun", 1200);
	    Student s3 = new Student(3, "gow", 1500);
	    
	    Student[] s ={s1,s2,s3};
	    System.out.println(Arrays.toString(s));
	    Comparator<Student>comp = new Comparator<Student>(){
		
	    
}
}
}