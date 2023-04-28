package com.java.basic.programs.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSumClosest {

    public static void main(String[] args) {
        int[] nums = {-1,2,1,4};
        int target = 0;
        Arrays.sort(nums);
        int sumOfInteger=0;
        int minvalue = Integer.MIN_VALUE;
        Set < List <Integer> > s = new HashSet<>();
        List<List<Integer>> output = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                minvalue = Math.abs(sum-target);
                if (sum == target) {
                    s.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                } else if (sum<target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        output.addAll(s);

    }
}
