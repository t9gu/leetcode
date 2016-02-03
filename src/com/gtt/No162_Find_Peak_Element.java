package com.gtt;

import java.util.Arrays;

public class No162_Find_Peak_Element {
	public int findPeakElement(int[] nums) {
		if (nums.length < 2)
			return 0;
		if (nums.length == 2) {
			if (nums[0] > nums[1])
				return 0;
			else
				return 1;
		}
		int[] nums1 = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			nums1[i] = nums[i];
		}
		Arrays.sort(nums);
		int target = nums[nums.length - 1];
		for (int i = 0; i < nums1.length; i++) {
			if (nums1[i] == target)
				return i;
		}
		return 0;

	}
}
