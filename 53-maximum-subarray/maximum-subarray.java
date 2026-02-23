class Solution {
    public int maxSubArray(int[] nums) {
        int ms = nums[0];  // maxSum
        int cs = nums[0];  // currentSum

        for(int i=1; i<nums.length; i++){
            cs = Math.max(nums[i], cs + nums[i]);
            ms = Math.max(ms, cs);
        }

        return ms;
    }
}