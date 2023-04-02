package com.java.basic.programs.strings;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "mindcraft";
		String str2 = "";

		for (int i = str.length() - 1; i >=0; i--) {

			str2 = str2 + str.charAt(i);

		}

		System.out.println("String is " + str2);

	}

}
