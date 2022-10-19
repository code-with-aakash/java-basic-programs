package com.java.basic.programs;

public class HowToPrintArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[5];

		printarray(new int[] { 1, 2, 3, 4, 5 });

	}

	private static void printarray(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}

	}

}
