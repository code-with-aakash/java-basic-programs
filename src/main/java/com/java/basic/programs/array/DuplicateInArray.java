package com.java.basic.programs.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 4 };

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {

			int count = 0;

			for (int j = 0; j < arr.length; j++) {

				if (arr[i] == arr[j]) {

					count++;
					map.put(arr[i], count);

				}
			}

		}

		ArrayList<Integer> araylist = new ArrayList<Integer>();

		for (Entry<Integer, Integer> entry : map.entrySet()) {

			if (entry.getValue() > 1) {

				araylist.add(entry.getKey());

			}

		}

		if (araylist.size() < 1) {

			araylist.add(-1);
		} else {

			System.out.println(araylist.toString());
		}
		
		
	}

}
