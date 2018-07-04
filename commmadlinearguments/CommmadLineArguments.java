package com.commmadlinearguments;

public class CommmadLineArguments {
	public static void main(String[] args) {
	 double sum=110.70;
	 
	 for (int i = 0; i < args.length; i++) {
		double a=Double.parseDouble(args[i]);
		sum=sum+a;
		System.out.println(a);
	}
	 System.out.println(sum);
}

}
