package com.gtt;

public class No13_Roman2Integer {
	public int romanToInt(String s) {
        char[] c = s.toCharArray();
        int count = chartoInt(c[0]);
        int pre = 0;
        int cur = 0;
        for(int i=1;i<s.length();i++){
            pre = chartoInt(c[i-1]);
            cur = chartoInt(c[i]);
            if(pre >= cur){
                count += cur;
            }else{
                count = count -2*pre+cur;
            }
        }
       return count;
       
    }
    public static int chartoInt(char c){
        int data = 0;
        switch(c){
            case 'I': 
                data = 1;
                break;
            case 'V':
                data = 5;
                break;
            case 'X':
                data = 10;
                break;
            case 'L':
                data = 50;
                break;
            case 'C':
                data = 100;
                break;
            case 'D':
                data = 500;
                break;
            case 'M':
                data = 1000;
                break;
        }
        return data;
    }
}
