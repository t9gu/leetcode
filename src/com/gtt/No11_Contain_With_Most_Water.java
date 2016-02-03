package com.gtt;

public class No11_Contain_With_Most_Water {
	public int maxArea(int[] height) {
        if(height.length <2) return 0;
        
        int left = 0;
        int right = height.length-1;
        int maxArea = 0;
        int area = 0;
        
        while(left < right){
            area = (Math.min(height[left],height[right]))*(right-left);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
            maxArea = Math.max(maxArea,area);
        }
        return maxArea;
    }
}
