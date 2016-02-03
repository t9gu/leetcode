package com.gtt;

public class No9_Palindrome_Num {
	public boolean isPalindrome(int x) {
        if(x<0 || x==10 ) return false;
        if(x<10) return true;
        int result = 0;
        int x2 = x;
        while(x/10 !=0){
            result = result*10+x%10;
            x=x/10;
        }
        result = result*10 +x;
        if(result == x2) return true;
        else return false;
    }
}
