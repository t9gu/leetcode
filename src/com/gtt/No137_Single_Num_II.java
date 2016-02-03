package com.gtt;

public class No137_Single_Num_II {
	public int singleNumber(int[] nums) {
        int result = 0;
        for(int i=0;i<32;i++){
            int count = 0;
            for(int j=0;j<nums.length;j++){
                count +=((nums[j]>>i)&1);
            }
            result |= ((count%3)<<i);
        }
        return result;
    }
}
