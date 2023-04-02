package com.java.basic.programs.sorting;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 9, 8, 7, 6, 5 };

		int l = 0;
		int h = arr.length - 1;
		QuickSort(arr, l, h);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}

	}

	private static void QuickSort(int[] arr, int l, int h) {
		// TODO Auto-generated method stub

		if (l < h) {
			int pivot = partition(arr, l, h);

			QuickSort(arr, l, pivot - 1);
			QuickSort(arr, pivot + 1, h);

		}

	}

	private static int partition(int[] arr, int l, int h) {
		// TODO Auto-generated method stub

		int pivot = arr[h];

		int i =l-1;
		for(int j=l;j<arr.length-1;j++) {
			if(arr[j]<pivot) {
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,h);
		return i+1;
	}

	private static void swap(int[] arr, int i, int j) {

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

}
