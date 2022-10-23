package com.java.basic.programs;

public class SecondMaximumValueInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 22, 4, 5, 12, 23, 43, 11, 10 };

		printArray(arr);

		int min = SecondMaximumValue(arr);

		System.out.println("Second Maximum value in array is " + min);

	}

	private static int SecondMaximumValue(int[] arr) {
		// TODO Auto-generated method stub

		int max = 0;

		int max2 = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {
				max2 = max;
				max = arr[i];

			} else if (arr[i] > max2 && arr[i] != max) {

				max2 = arr[i];

			}
		}

		return max2;
	}

	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub

		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println();

	}

}
