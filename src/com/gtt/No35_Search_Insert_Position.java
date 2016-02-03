package com.gtt;

public class No35_Search_Insert_Position {
	public int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target) return i;
            else if(i == nums.length-1 && nums[i]<target) return nums.length;
            else if(i == 0 && nums[i]>target) return 0;
            else if(nums[i]<target&&nums[i+1]>target&&i+1 != nums.length) return i+1;
        }
        return 0;
    }
}
