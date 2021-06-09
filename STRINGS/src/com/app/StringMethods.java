/*  8.toUpperCase():String 
• Converts string into uppercase 
9.toLowerCase():String 
• Converts string into lowercase 
10.startsWith(string):boolean 
• check whether string is starting with given string or not 
11.endsWith(string):boolean 
• check whether string is ending with given string or not 
12.contains(String):boolean 
• checks whether string is present in given string or not 
13.isEmpty():boolean 
• checks whether string is empty or not 
14.object.concat(String) 
• concatinates string in end of called string  */

package com.app;

public class StringMethods {

	public static void main(String[] args) {

		String s="jaVA DEvelopment"; 
		 String up=s.toUpperCase(); 
		 String lo=s.toLowerCase(); 
		 System.out.println(up); 
		 System.out.println(lo); 
		 System.out.println(s.startsWith("sql")); 
		 System.out.println(s.endsWith("ent")); 
		 System.out.println(s.contains("vel")); 
		 String s1=""; 
		 System.out.println(s1.isEmpty());
	}

}
