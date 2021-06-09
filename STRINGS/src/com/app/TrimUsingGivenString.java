//WAP to count no of words present in string

/*.trim():String 
• it removes white spaces from starting and ending of string 
• trim() will not remove spaces from middle 
• Ex: s="      java dev     "; 
 s.trim(); --->"java dev"     */

package com.app;

public class TrimUsingGivenString {

	public static void main(String[] args) {

		String s="     I am a java            developer          ";
		System.out.println("Before Trimming: "+s);
		String s1=s.trim();    //helps to remove spaces from start and end of sentence
	     System.out.println("After Trimming:" +s1);
	     int count=1;
	     for(int i=0;i<s1.length();i++) {
	    	 if(s1.charAt(i)==' ' && s1.charAt(i+1)!=' ') {
	    		 count=count+1;
	    		 
	    	 }
	     }
	     
	     System.out.println("No. of words are: " +count);
	}

}
