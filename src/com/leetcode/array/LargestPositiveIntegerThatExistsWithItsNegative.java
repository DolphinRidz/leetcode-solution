package com.leetcode.array;

import java.util.HashSet;

public class LargestPositiveIntegerThatExistsWithItsNegative {

	public static int findMaxK(int[] nums) {
		HashSet<Integer> st = new HashSet<>();

		for (int i : nums)
			st.add(i);
		int res = -1;
		for (int p : nums)
			if (p > 0 && st.contains(-p))
				res = Math.max(res, p);
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int outputArray = findMaxK(new int[] {-1,2,-3,3});
//		int outputArray = findMaxK(new int[] {-1,10,6,7,-7,1,-11,11});
		int outputArray = findMaxK(new int[] {-10,8,6,7,-2,-3});
		System.out.print("Largest Positive Integer That Exists With Its Negative  : " + outputArray);

	}
}
