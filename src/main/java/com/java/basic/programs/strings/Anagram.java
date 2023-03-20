package com.java.basic.programs.strings;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "forgeeksgeeks";
		String b = "geeksforgeeks";

		char[] a2 = a.toCharArray();
		char[] b2 = b.toCharArray();

		Arrays.sort(a2);
		Arrays.sort(b2);

		System.out.println(Arrays.equals(b2, a2));

	}

}
