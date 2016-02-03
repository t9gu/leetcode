package com.gtt;

import java.util.HashSet;
import java.util.Set;

public class No219_Contains_Duplicate_II {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k >= nums.length){
            Set<Integer> intSet = new HashSet<Integer>(nums.length);
            for(int i=0;i<nums.length;i++){
                intSet.add(nums[i]);
            }
            if(intSet.size() == nums.length) return false;
            else return true;
        }else{
            for(int m=0;m<nums.length-1;m++){
                for(int n=m+k;n>m&&m+k<nums.length;n--){
                    if(nums[m]== nums[n]) return true;
                }
            }
            return false;
        }
    }
}
