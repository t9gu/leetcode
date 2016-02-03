package com.gtt;

import java.util.Arrays;

public class No215_Kth_Largest_in_Array {
	public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
