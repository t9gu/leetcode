package com.gtt;

import java.util.Arrays;

public class No154_Find_Min_in_Rotated_Sorted_Array_II {
	public int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }
}
