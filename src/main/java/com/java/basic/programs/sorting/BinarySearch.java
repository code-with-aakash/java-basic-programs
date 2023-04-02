package com.java.basic.programs.sorting;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a key ");
		int key = sc.nextInt();
		int l = 0;
		int h = num.length - 1;
		int index = BinarySearch(num, key, l, h);
		if(index==-1)
			System.out.println("element not found");
		else
		System.out.println("element found at "+index);

	}

	private static int BinarySearch(int[] num, int key, int l, int h) {
		// TODO Auto-generated method stub

		int mid = (l + h) / 2;

		while (l <= h) {

			if (num[mid] == key)
				return mid;
			else if (num[mid] < key)
				return BinarySearch(num, key, mid + 1, h);
			else if (num[mid] > key)
				return BinarySearch(num, key, l, mid - 1);

		}
		return -1;

	}

}
