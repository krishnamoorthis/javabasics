
package com.staticvariable;

public class SavingsAccount {
	static double annualInterestRate;
	double savingsBalance;
	
	public SavingsAccount(double savingsBalance){
		this.savingsBalance=savingsBalance;
		
	}
	
	public SavingsAccount(){
		this.savingsBalance=savingsBalance;
		
	}
	
	
	public void calculateMonthlyInterst(){
		double amount=((savingsBalance*( annualInterestRate/100))/12);
		savingsBalance=savingsBalance+amount;
		
	}
     public  void modifyInterestRate(double intrest){
    	 annualInterestRate= intrest;
     }
     public void showBalance(String s){
    	 System.out.println("balance of "+s+"="+savingsBalance);
    	 //this.savingsBalance=savingsBalance;
     }
     
     public static void main(String[] args) {
    	 SavingsAccount s1 = new SavingsAccount(5000);
    	 SavingsAccount s2 = new SavingsAccount(1000);
    	 
    	
    	s1.modifyInterestRate(4);
    	s1.calculateMonthlyInterst();
    	s1.showBalance("s1");
    	
    	s2.modifyInterestRate(4);
    	s2.calculateMonthlyInterst();
    	s2.showBalance("s2");
    	
    	
    	
    	s1.modifyInterestRate(5);
    	s1.calculateMonthlyInterst();
    	s1.showBalance("s1");
    	
    	s2.modifyInterestRate(5);
    	s2.calculateMonthlyInterst();
    	s2.showBalance("s2");
    	
    	//System.out.println("balance s1"+savingsBalance);
    	
	}
}
