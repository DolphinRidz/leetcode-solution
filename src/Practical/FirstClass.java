package Practical;

import java.util.Arrays;

public class FirstClass {
	
	public static int[] runningSum(int[] nums) {
        int i = 1;
        while (i<nums.length){//i=1
            nums[i]= nums[i] + nums[i-1];//num[1]=num[1]+nums[1-1]=2+1=3
            i++;
        }
        return nums;
    }
	
	public static void main (String args[]) {
		int[] outputArray = runningSum(new int[] {1, 2,3,4});
		                                         //0 1
		System.out.print(Arrays.toString(outputArray));
	}

}
