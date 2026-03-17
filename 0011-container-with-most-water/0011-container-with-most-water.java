class Solution {
    public int maxArea(int[] height) {
     int left = 0;
     int right = height.length-1;
     int maxArea =0, currArea=0;

     while(left < right) {
        int width = right-left;
        int heightt= Math.min(height[left],height[right]);
        currArea = width * heightt; 
        maxArea = Math.max(currArea,maxArea);
        if(height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
     }  
     return maxArea; 
    }
}