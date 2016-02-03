package com.gtt;

public class No58_Length_of_Last_Word {
	public int lengthOfLastWord(String s) {
        s = s.trim();
        if(s.lastIndexOf(" ") != -1){
            return s.length()-1-s.lastIndexOf(" ");
        }else if(!s.contains(" ")){
            return s.length();
        }else return 0;
    }
}
