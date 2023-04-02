package com.java.basic.programs.leetcode.medium;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4 };
		int[] result = new int[nums.length];
		
		 for (int i = 0, tmp = 1; i < nums.length; i++) {
		        result[i] = tmp;
		        tmp *= nums[i];
		    }
		    for (int i = nums.length - 1, tmp = 1; i >= 0; i--) {
		        result[i] *= tmp;
		        tmp *= nums[i];
		    }

		/*
		 * for (int i = 0; i <= nums.length - 1; i++) { int sum = 1; for (int j = 0; j
		 * <= nums.length - 1; j++) {
		 * 
		 * if (i != j) { sum = sum * nums[i]; }
		 * 
		 * } num[i] = sum;
		 * 
		 * System.out.println("ending");
		 * 
		 * }
		 */

	}

}
