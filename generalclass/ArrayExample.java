package com.generalclass;

import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.Timer;
import java.util.TimerTask;

import com.java.lang.Employee;

public class ArrayExample {

	public static void main(String[] args) {
		int a[]={9,8,7,6,5,4};
		int b[]=Arrays.copyOf(a,a.length);
		for (int i = 0; i < b.length; i++) {
			System.out.println(" "+b[i]);
		}
		System.out.println("------------KRISH---------------");
		
		Arrays.sort(a);
		for (int i = 0; i < b.length; i++) {
			System.out.println(" "+a[i]);
		}
		
		Employee emp =new Employee(1,"google",22235.23);
		Employee emp1 =new Employee(1,"ebay",96235.33);	
		Employee emp2=new Employee(1,"google",72235.43);	
		Employee emp3=new Employee(1,"ebay",42635.53);	
		Employee emp4 =new Employee(1,"google",89235.63);	
		Employee[] empArr={emp,emp1,emp2,emp3,emp4};
		System.out.println("--------------------");
		
		System.out.println(Arrays.toString(empArr));
		
	Comparator<Employee> comparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			/*if(o1.getSal() > o2.getSal()){
				return 1;
			}
			if(o1.getSal() < o2.getSal()){
				return -1;
			}
			return 0;*/
			return Double.compare(o1.getSal(), o2.getSal());
		}
		
	}; 
		
		Arrays.sort(empArr,comparator);
		System.out.println(Arrays.toString(empArr));
		 
		  StringTokenizer st = new StringTokenizer("this , is , a , test",",");
		     while (st.hasMoreTokens()) {
		         System.out.println(st.nextToken());
		     }

		 
		     Timer timer = new Timer();
		
			timer.schedule(new TimerTask() {
				
				@Override
				public void run() {

System.out.println("Delay.......");
					
				}
			}, 3000,5000);
		//Arrays.toString(empArr);
		
		}
		
	}



