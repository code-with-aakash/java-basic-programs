package com.java.basic.programs.quetions;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year = 2013;
		
		Boolean yr = Leapyear(year);
		
		System.out.println(yr);

	}

	private static Boolean Leapyear(int year) {
		// TODO Auto-generated method stub
		
		if(year%4==0 &&year%100!=0)
			return true;
		else 
		return false;
	}

}
