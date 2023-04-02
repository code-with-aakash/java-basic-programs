package com.java.basic.programs.strings;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "epygtl ";

		String[] str = s.trim().split(" ");

		String str2 = "";
		
		if(str.length>1) {

		for (int i = str.length - 1; i >= 0; i--) {

			str2 = str2.trim() +" "+ str[i].trim() ;

		}
		}else {
			str2=s.trim();
		}
		System.out.println(str2);

	}

}
