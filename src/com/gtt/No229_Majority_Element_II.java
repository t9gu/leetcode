package com.gtt;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class No229_Majority_Element_II {
	public List<Integer> majorityElement(int[] nums) {
        List<Integer> l1 = new LinkedList<Integer>();
        HashSet<Integer> hs = new HashSet<Integer>();
        
        if(nums.length == 0 ) return l1;
        if(nums.length == 1){
            l1.add(nums[0]);
            return l1;
        }
        
        Arrays.sort(nums);
        int target = nums.length/3;
        for(int i=0;i<nums.length-target;i++){
            if(!hs.contains(nums[i])){
                if(nums[i] == nums[i+target]) {
                    l1.add(nums[i]);
                    hs.add(nums[i]);
                }
            }
        }
        return l1;
    }
}
