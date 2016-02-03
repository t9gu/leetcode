package com.gtt;

import java.util.Arrays;

public class No16_3Sum_Closest {
	public int threeSumClosest(int[] nums, int target) {
		int count = 0;
		if (nums.length <= 3) {
			for (int i = 0; i < nums.length; i++) {
				count += nums[i];
			}
			return count;
		}

		// sort array
		Arrays.sort(nums);
		int close = nums[0] + nums[1] + nums[2];
		for (int i = 0; i < nums.length - 2; i++) {
			// //avoid duplicate solutions
			// if (i == 0 || nums[i] > nums[i - 1]) {

			int start = i + 1;
			int end = nums.length - 1;

			while (start < end) {
				// case 1
				if (nums[start] + nums[end] + nums[i] == target) {
					return target;
					// case 2
				} else if (nums[start] + nums[end] + nums[i] < target) {
					if (Math.abs(nums[start] + nums[end] + nums[i] - target) < Math
							.abs(close - target)) {
						close = nums[start] + nums[end] + nums[i];
					}
					start++;
					// case 3
				} else {
					if (Math.abs(nums[start] + nums[end] + nums[i] - target) < Math
							.abs(close - target)) {
						close = nums[start] + nums[end] + nums[i];
					}
					end--;
				}
				// }

			}
		}

		return close;

	}
}
