package com.gtt;

public class No283_Move_Zeros {
	
	public void moveZeroes(int[] nums) {
        if(nums == null){
        	return;
        }
        int temp;
        for(int i=0;i<nums.length-1;i++){
        	for(int j=0; j<nums.length-1;j++){
        		if(nums[j] == 0){
        			temp = nums[j];
        			nums[j] = nums[j+1];
        			nums[j+1] = temp;
        		}
        	}
        }
        
    }
}
