package com.java.basic.programs.strings;

public class StringIsPalindromeOrNot {

	public static void main(String[] args) {

		String st = "mumbai";

		palindromeCheck(st);

	}

	private static void palindromeCheck(String st) {

		String abc = "";

		for (int i = st.length()-1; i >= 0; i--) {

			abc = abc + st.charAt(i);

		}
		if(abc.equalsIgnoreCase(st)) {
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("String is Not Palindrome");
		}

	}

}
