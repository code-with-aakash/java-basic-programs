package com.java.basic.programs;

public class MissingNumberInArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 6, 7 };
		int n = 7;
		System.out.println("length of array is " + n);

		printArray(arr);

		int number = MissingNumberInArray(arr, n);

		System.out.println("Missing Number Is-->" + number);

	}

	private static int MissingNumberInArray(int[] arr, int n) {

		int missingNumber = 0;

		for (int i = 0; i < arr.length; i++) {

			for (int j = 1; j <= n; j++) {

				if (arr[i] == j) {

				} else {
					missingNumber = arr[i];
				}

			}

		}

		return missingNumber;
	}

	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub

		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println();

	}

}
