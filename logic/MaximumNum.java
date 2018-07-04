package com.logic;


	import java.util.*;

	public class MaximumNum
	{
		public void printTwoMaxNumbers(int[] nums){
			int firstmax=0;
			int secondmax=0;
			
			for(Integer n : nums)
			{
				if(firstmax<n){
					secondmax=firstmax;
					firstmax=n;
				}
				else  if (secondmax<n){
					secondmax=n;
				}
			}
			System.out.println(firstmax);
			System.out.println(secondmax);
			
			
			
		}
		
		public static void main(String s[])
		{
			Scanner s1 = new Scanner(System.in);
			int[] nums = new int[8];
			for(int i=0;i<8;i++){
				
				
			 nums[i] = s1.nextInt();
			}
			MaximumNum t1 = new MaximumNum();
			
			t1.printTwoMaxNumbers(nums);
			
		}
	

	}
	
