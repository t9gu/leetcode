package com.gtt;

public class No7_Reverse_Integer {

	    public int reverse(int x) {
	        if(x<10 && x>= 0) return x;
	          if(x>=Integer.MAX_VALUE || x<=Integer.MIN_VALUE) return 0;
	        
	        boolean neg = false;
	        if(x< 0 ) {
	            neg= true;
	            x = 0-x;
	        }
	        int result = 0;
	        
	        while(x/10 != 0){
	            result = result*10+x%10;
	            x = x/10;
	        }
	        if(result>Integer.MAX_VALUE/10) return 0;
	        result = result*10 +x;
	         
	        if(result>Integer.MAX_VALUE) return 0;
	        if(neg) return 0-result;
	        else return result;
	    }
	
}
