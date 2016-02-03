package com.gtt;

import java.util.Arrays;

public class No169_Majority_Element {
	public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<(nums.length+1)/2;i++){
            if(nums[i] == nums[i+nums.length/2]){
                return nums[i];
            } 
        }
        return 0;
    }
}
