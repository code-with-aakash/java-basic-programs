package com.java.basic.programs.leetcode.easy;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {-1,0,1,2,-1,-4};
		int target = 0;
		int[] result = new int[2];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i <= nums.length - 1; i++) {

			if (map.containsKey(target - nums[i])) {
				result[1] = i;
				result[0] = map.get(target - nums[i]);

			}
			map.put(nums[i], i);

		}

	}

}
