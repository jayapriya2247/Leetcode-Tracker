// Last updated: 7/9/2026, 3:06:03 PM
class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int n = nums.length;
        int maxLeft = nums[0];
        int maxSum = Integer.MIN_VALUE;
        for(int j=k;j<n;j++){
            maxLeft = Math.max(maxLeft, nums[j-k]);
            maxSum = Math.max(maxSum, maxLeft + nums[j]);
        }
        return maxSum;
        
    }
}