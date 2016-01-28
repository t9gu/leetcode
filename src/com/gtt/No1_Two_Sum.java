package com.gtt;

public class No1_Two_Sum {
	public int[] twoSum(int[] nums, int target) {
        int[] newSum = new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int m=i+1;m<nums.length;m++){
                if(nums[m] == target-nums[i]) {
                    newSum[0]=i+1;
                    newSum[1]=m+1;
                    break;
                }
            }
        }
       return newSum; 
        
    }
}
