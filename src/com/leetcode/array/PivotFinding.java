package com.leetcode.array;

import java.util.Arrays;

public class PivotFinding {
	public static int pivotIndex(int[] nums) {
		int sum = 0, leftsum = 0;
		for(int i=0;i<nums.length;i++){
			sum+=nums[i];
			}
		System.out.print("sum  : " + sum);
		for (int i = 0; i < nums.length; ++i) {

			if (leftsum == sum - leftsum - nums[i])//0==2-0-2
				 									//0==0
				return i;//0

			leftsum = leftsum + nums[i];
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int outputArray = pivotIndex(new int[] {2,1,-1 });
		System.out.print("Pivot point is  : " + outputArray);

	}

}
