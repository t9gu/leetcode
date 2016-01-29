package com.gtt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class No179_Largest_Num {
	public String largestNumber(int[] nums){
		if(nums == null){
			return null;
		}
		
		List<Integer> li = new ArrayList<Integer>();
		for(int n:nums){
			li.add(n);
		}
		
		Collections.sort(li,new Comparator<Integer>(){
			public int compare(Integer o1, Integer o2){
				String s1 = ""+o1+o2;
				String s2 = ""+o2+o1;
				return s2.compareTo(s1);
			}
		});
		
		StringBuffer sb = new StringBuffer();
		for(int n:li){
			sb.append(n);
		}
		
		if(sb.charAt(0) == '0'){
			return "0";
		}
		
		return sb.toString();
	}
}
