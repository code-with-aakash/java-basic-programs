package com.java.basic.programs.sorting;

public class InsertionSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 9, 8, 7, 6, 5 };

		for (int i = 1; i < arr.length; i++) {

			int j = i - 1;
			int key = arr[i];

			while (j >= 0 && arr[j] > key) {

				arr[j+1] = arr[j];
				j=j-1;
			}

			arr[j+1] = key;

		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}

	}

}
