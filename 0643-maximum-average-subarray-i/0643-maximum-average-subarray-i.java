class Solution {
    public double findMaxAverage(int[] nums, int k) {
    double maxSum = Integer.MIN_VALUE;
    int windowSum = 0;
    for(int i = 0; i<nums.length;i++) {
        windowSum+= nums[i];

        if((i >= k-1)) {
           maxSum = Math.max(maxSum,windowSum);
           windowSum = windowSum - nums[i-(k-1)]; 
        }
    }
    return maxSum/k;   
    }
}