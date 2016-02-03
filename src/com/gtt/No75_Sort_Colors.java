package com.gtt;

public class No75_Sort_Colors {
	public void sortColors(int[] nums) {
		int red = 0;
		int white = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0)
				red++;
			if (nums[i] == 1)
				white++;
		}
		int blue = nums.length - red - white;

		int j = 0;
		while (j < nums.length) {
			if (j < red) {
				nums[j] = 0;
			} else if (j < nums.length - blue && j >= red) {
				nums[j] = 1;
			} else {
				nums[j] = 2;
			}
			j++;
		}
	}
}
