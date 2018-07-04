package com.logic;

import java.util.*;

public class Anagram{

private static Scanner s1;

public static boolean isAnagram(String word,String anagram) {
   byte[] b1 = word.toUpperCase().getBytes();
    byte[] b2 = anagram.toUpperCase().getBytes();
	
	Arrays.sort(b1);
	Arrays.sort(b2);
	System.out.println(Arrays.equals(b1, b2));
	return false;
   


}

  public static void main(String s[]){
  s1 = new Scanner(System.in);
  String word = s1.next();
  String anagram = s1.next();
  
  boolean ans=isAnagram(word,anagram);
  System.out.println(ans);
  }
  }

