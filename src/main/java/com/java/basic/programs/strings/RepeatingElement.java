package com.java.basic.programs.strings;

public class RepeatingElement {

	public static void main(String[] args) {

		int n = 7;
		int arr[] = { 1, 5, 3, 4, 3, 5, 6 };
		int count = 0;
		for (int i = 0; i < arr.length-1; i++) {

			if (arr[i] == arr[i + 1]) {
				count++;
			}

		}

	}

}
