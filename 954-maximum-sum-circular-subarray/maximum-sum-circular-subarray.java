class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalsum = nums[0];

        int currmax = nums[0], maxsum = nums[0];
        int currmin = nums[0], minsum = nums[0];
    for(int i = 1; i<nums.length; i++){
        totalsum = totalsum+nums[i];

        currmax = Math.max(nums[i], currmax+nums[i]);
        maxsum = Math.max(currmax, maxsum);

        currmin = Math.min(nums[i],currmin+nums[i]);
        minsum = Math.min(currmin,minsum);
    }
    if(maxsum<0) return maxsum;

    return Math.max(maxsum,totalsum-minsum);
    }
}