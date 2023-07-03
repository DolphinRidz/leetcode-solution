package com.leetcode.array;

import java.util.HashMap;
import java.util.Map;

//Given an array of integers nums and an integer target,
//return indices of the two numbers such that they add up to target.
// Solution has Space and time complexity of O(n)
public class TwoSum {
	public static int[] twoSumFunc(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int cur = nums[i];
            //cur +x = target
            // x= target- cur
            int x = target-cur;
            //Check in the map if the x exists or put the number for future reference
            if (map.containsKey(x)){
                return new int[]{map.get(x), i};
            }
            map.put(cur,i);
        }
        return null;
    }

	public static void main(String[] args) {
		 int[] a = new int[] {1 , 4 , 5 , 11 , 12};
	        int target = 9;
	        int[] indices = twoSumFunc(a, target);
	            System.out.print("Two indices that gives the sum of "+target+" are: "+ indices[0] + " and " + indices[1] );

	  

	}

}
