package com.app;

public class SBuffer_Builder {

	public static void main(String[] args) {

		StringBuffer b1=new StringBuffer("java"); 
		 StringBuilder b2=new StringBuilder("java"); 
		 System.out.println(b1.equals(b2)); 
		 System.out.println(b1); 
		 System.out.println(b2); 
		 b1.append("Development"); 
		 b2.append("Full Stack"); 
		 System.out.println(b1); 
		 System.out.println(b2);
	}

}
