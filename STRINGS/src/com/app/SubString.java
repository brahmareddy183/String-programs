/*(a) subString(int arg):String 
             • it provides subpart of a string 
    (b) subString(int fromindex,int toindex):String 
              • subString(int fromindex(including),int toindex(excluding)):String 
*/

package com.app;

public class SubString {

	public static void main(String[] args) {

		String s="java developer";
		String s1=s.substring(3);
		System.out.println(s1);
		String s2=s.substring(2, 9);
		System.out.println(s2);
	}

}
