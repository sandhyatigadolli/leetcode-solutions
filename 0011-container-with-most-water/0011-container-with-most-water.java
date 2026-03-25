class Solution {
    public int maxArea(int[] height) {
    int left = 0, right =height.length-1;
    int currArea=0, maxArea=0;
    while(left < right) {
        int width = right - left;
        int heightt = Math.min(height[left], height[right]);
        currArea = width * heightt;
        maxArea = Math.max(maxArea,currArea);

        if(height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }  
    return maxArea; 
    }
}