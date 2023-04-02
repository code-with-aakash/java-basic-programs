package com.java.basic.programs.leetcode.easy;

import java.util.Scanner;

public class FibonaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter positive number");

		int num = sc.nextInt();
		int max = 0;
		int n1 =0,n2=1,n3=0;
		
		System.out.print(n1);
		System.out.print(" +"+n2);

		for(int i =2 ;i<num;i++) {
			n3 = n1+n2;
			System.out.print(" + "+n3);
			n1=n2;
			n2=n3;
		}
		
		System.out.println(n3+n2);


	}

}
