package com.synchronizedworker;

public class SysnchronizedWork { 
	private   int count =0;
	public static void main(String[] args) {
		SysnchronizedWork work = new SysnchronizedWork();
		work.dowork();
}
      public synchronized void increment () throws InterruptedException{
    	  count++;
      }
      public void dowork(){
    	  Thread thread1 = new Thread(Runnable()){
    		  public void run(){
    			  for (int i = 0; i < 10000; i++) {
					try {
						increment();
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
    		  }
    	  } ;
    	  thread1.start();
    	  Thread thread2 = new Thread(Runnable()){
    		  public void run(){
    			  for (int i = 0; i < 10000; i++) {
					try {
						increment();
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
    		  }
    	  } ;
    	  thread2.start();
    	  
    	  try{
    		  thread1.join();
    		  thread2.join();
    	  }catch(InterruptedException ignored){}
        System.out.println("count is"+count);
      }
	private Runnable Runnable() {
		// TODO Auto-generated method stub
		return null;
	}
}
