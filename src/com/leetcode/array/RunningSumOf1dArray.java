package com.leetcode.array;
class RunningSumOf1dArray {
    public int[] runningSum(int[] nums) {
        int counter =1;
        while(counter<nums.length){
            nums[counter]= nums[counter] + nums[counter-1];
            counter ++;
        }
            return nums;
    }
}