package com.gtt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class No14_Longest_Common_Prefix {
	public String longestCommonPrefix(String[] strs) {
        List<Integer> li = new ArrayList<Integer>();
        if(strs.length == 0) return "";
        for(int i=0;i<strs.length;i++){
            if(strs[i].length() == 0 || strs[i] == "") return "";
            li.add(strs[i].length());
        }
        Object[] nums = li.toArray();
        Arrays.sort(nums);
        int count = (int)nums[0];
        for(int m=count;m>0;m--){ 
        	Set<String> mp = new HashSet<String>();
        	String s2 = null;
            for(int n=0;n<strs.length;n++){          
                s2 = strs[n].substring(0,m);
                mp.add(s2);
            }
            if(mp.size() == 1) return s2;
    }
    return "";
    }
}
