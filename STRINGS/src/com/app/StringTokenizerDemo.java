package com.app;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		String str = "JHI637bi#iuZUhiua#9JHuhu";
		StringTokenizer st = new StringTokenizer(str, "Z9");
		System.out.println(st.countTokens());
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
