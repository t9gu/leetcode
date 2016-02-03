package com.gtt;

public class No28_Implement_Strstr {
	public int strStr(String haystack, String needle) {
        if(needle ==  null) return -1;
        if(haystack == null) return -1;
        if(haystack.length() == 0 && needle.length() == 0 ) return 0;
        if(haystack.equals(needle)) return 0;
        
        if(haystack.contains(needle)){
            for(int i=0;i<haystack.length()-needle.length()+1;i++){
                if(haystack.substring(i,i+needle.length()).equals(needle)) return i;
            }
            return -1;
        }else{
            return -1;
        }
    }
}
