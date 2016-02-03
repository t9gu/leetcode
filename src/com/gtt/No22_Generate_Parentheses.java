package com.gtt;

import java.util.ArrayList;
import java.util.List;

public class No22_Generate_Parentheses {
	public List<String> generateParenthesis(int n) {
        List<String> li = new ArrayList<String>();
        rec(n,0,0,"",li);
        return li;
    }
    
    public static void rec(int n, int left, int right, String s, List<String> li){
        if(left<right) return;
        
        if(left == n && right == n){
            li.add(s);
            return;
        }
         
        if(left == n){
            rec(n, n, right+1, s+")",li);
            return;
        }
        
        rec(n, left+1,right,s+"(",li);
        rec(n, left, right+1,s+")",li);
    }
}
