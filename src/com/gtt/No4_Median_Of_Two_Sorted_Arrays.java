package com.gtt;

import java.util.Arrays;

public class No4_Median_Of_Two_Sorted_Arrays {

	    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
			int length = nums1.length+nums2.length;
			int[] nums3 = new int[length];
			for(int i = 0;i<nums1.length;i++){
				nums3[i] = nums1[i];
			}
			for(int j = 0;j<nums2.length;j++){
				nums3[j+nums1.length] = nums2[j];
			}
			Arrays.sort(nums3);
			if(nums3.length %2 == 0) return (double)(nums3[length/2-1]+nums3[length/2])/2;
			else return (double)nums3[length/2];
	       
	    }

	
}
