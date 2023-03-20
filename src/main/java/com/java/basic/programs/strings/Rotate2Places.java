package com.java.basic.programs.strings;

public class Rotate2Places {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "amazon";
		String str2 = "azonam";
		
		char[] cha = str1.toCharArray();
		char[] chd = str2.toCharArray();
		char[] chr ;
		
		String str3="";
		int j =0;
		
		for(int i =0 ;i<cha.length;i++) {
			
			if(i==0) {
			char count = cha[0];
			cha[0]=cha[cha.length-1];
			cha[1]=count;
			}
			else if(i<cha.length-1) {
				cha[j+1]=cha[i];
			}
			
			
		}
		String xyz="";
		
		for(int i =0;i<cha.length;i++) {
			
			xyz = xyz +cha[i]; 
		}
		
		System.out.println("string is "+xyz.toString());

	}

}
