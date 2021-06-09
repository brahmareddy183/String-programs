package com.app;

public class IndexOf {

	public static void main(String[] args) {
		String s="java development"; 
		int i=s.indexOf('a');//--->1 
		System.out.println(i); 
		int j=s.indexOf("dev");//--->5 
		System.out.println(j); 
		int k=s.indexOf('a',2);//--->3 
		System.out.println(k); 
		int l=s.indexOf("eve",4);//--->6
		System.out.println(l); 
		int m=s.indexOf('Z'); 
		System.out.println(m);//--->-1

	}

}
