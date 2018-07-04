package com.java.lang;

public class RunnableImpls implements Runnable {
	
		 String name;
		 public RunnableImpls(String name){
			 this.name=name;
			 Thread thread = new Thread();
			 thread.start();
			 
		}
		 @Override
		public void run() {
			for (int i = 0; i <10; i++) {
				System.out.println(name+" "+i+" "+Thread.currentThread());
				
				try {
					ThreadExample.sleep(50);
				} catch (InterruptedException e) {


					e.printStackTrace();
				}
				
			}
		}
		 public static void main(String[] args) {
			 RunnableImpls one = new RunnableImpls("one");
			 RunnableImpls two= new RunnableImpls("two");
			System.out.println("Main Done"+Thread.currentThread());
		}


}
