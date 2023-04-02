package com.java.basic.programs.leetcode.medium;

public class BuyAndSellStocks2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] prices = { 7, 1, 5, 3, 6, 4 };

		int max2[] = new int[prices.length], min = prices[0], max = 0;
		for (int i = 1; i < prices.length; i++) {

			if (prices[i - 1] < prices[i]) {
				max = max + prices[i] - prices[i - 1];
			}
		}
		int maximum = 0;
		for (int i = 0; i < max2.length - 1; i++) {
			maximum = maximum + max2[i];
		}

	}

}
