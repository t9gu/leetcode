package com.gtt;

import java.util.HashSet;
import java.util.Set;

public class No217_Contains_Duplicate {
	public boolean containsDuplicate(int[] nums) {
        Set<Integer> intList =new HashSet<Integer>(nums.length);
        for(int i=0; i<nums.length;i++){
            intList.add(nums[i]);
        }
        if(intList.size() == nums.length) return false;
        else return true; 
    }
}
