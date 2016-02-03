package com.gtt;

import java.util.Arrays;

public class No3_Longest_Substring_Without_Repeating_Chars {

	    public int lengthOfLongestSubstring(String s) {
	        if(s.length() == 0 || s =="") return 0;
	       int[] asc = new int[256];
	       Arrays.fill(asc,-1);
	       int start = 0;
	       int end = 1;
	       int max = 1;
	       
	       asc[s.charAt(0)] = 0;
	       while(end<s.length()){
	           if(asc[s.charAt(end)] >= start){
	               start=asc[s.charAt(end)]+1;
	           }
	           max = Math.max(max,end-start+1);
	           asc[s.charAt(end)] = end;
	           end++;
	       }
	       return max;
	    }
	
}
