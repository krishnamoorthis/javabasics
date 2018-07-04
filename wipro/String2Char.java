package com.wipro;
import java.lang.*;
import java.util.Scanner;

public class String2Char {
	public static void main(String[] args) {

 Scanner sc = new  Scanner(System.in);
String a= sc.nextLine();
String b=  a.toUpperCase();
String[] c = b.split(" ");
for(int i=0;i<c.length;i++)
{
	char[] d = c[i].toCharArray();
	for(int j =0;j<d.length;j++)
	{
		int t=0;
		int f[] = new int[d.length];
	       int e = (int)d[j];
	       f[t] =e;
	       t++;
	 for(int k=0;k<f.length;k++)
	 {
		 System.out.println(f[k]);
	 }
	}
}






}
}