package com.java.basic.programs.leetcode.easy;

import java.util.Arrays;

public class PivotIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = { 2, 3, -1, 8, 4 };

		int sum = 0;

		for (int i = 0; i <= num.length - 1; i++) {
			sum = sum + num[i];
		}
		int leftindex = 0;
		for (int i = 0; i <= num.length - 1; i++) {
			if (leftindex*2 == sum-num[i]) {
				System.out.println("element is fund at->"+i);
			}
			leftindex = leftindex + num[i];
		}

	}

}
