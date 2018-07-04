package com.java.lang;

import java.io.IOException;

public class RuntimeExamples {
	public static void main(String[] args) {
		long start = System .currentTimeMillis(); 
		long startnano = System .nanoTime();
		Runtime runtime = Runtime.getRuntime();
		runtime.addShutdownHook(new Thread()
			{
			@Override
			public void run() {
				System.out.println("JV machine is shouting down");
			}
			});
		int pro = runtime.availableProcessors();
		System.out.println(pro);
		long end = System .currentTimeMillis();
		long endnano = System .nanoTime();
		System.out.println(end-start);
		System.out.println(endnano-startnano);
		System.out.println(System.getenv());
		
		int one[]={1,2,3,4};
		int two[]= new int[one.length];
		System.arraycopy(one, 0, two, 0, one.length);
	
		
	/*	
		try {
			Process process = runtime.exec("notepad");
			 process.waitFor();
		} catch (Exception e) {
             e.printStackTrace();
		}*/
	}

}
