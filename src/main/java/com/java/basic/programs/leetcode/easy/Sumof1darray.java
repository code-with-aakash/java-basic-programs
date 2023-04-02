package com.java.basic.programs.leetcode.easy;

public class Sumof1darray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {3,1,2,10,1};
		
		int[] sum = new int[nums.length];

        for(int i =0;i<=nums.length-1;i++){
        	if(i==0) {
        		sum[i]=sum[i]+nums[i];	
        	}
        	if(i>0) {
            sum[i]=sum[i-1]+nums[i];
        	}

        }

	}

}
