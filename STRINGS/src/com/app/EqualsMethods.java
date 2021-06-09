package com.app;

public class EqualsMethods {

	public static void main(String[] args) {

		String s1=new String("javadev"); 
		 String s2="javadev"; 
		 System.out.println(s1.equals(s2)); 
		 System.out.println(s1==s2); 
		 String s3="javadev"; 
		 System.out.println(s2==s3); 

		 System.out.println(".....................");
		 
		 String s4=new String("javaDev"); 
		 String s5="javadev"; 
		 System.out.println(s4.equalsIgnoreCase(s5)); 
		 System.out.println(s4==s5); 
		 String s6="javadev"; 
		 System.out.println(s4.equalsIgnoreCase(s6)); //not casensitive
	}

}
