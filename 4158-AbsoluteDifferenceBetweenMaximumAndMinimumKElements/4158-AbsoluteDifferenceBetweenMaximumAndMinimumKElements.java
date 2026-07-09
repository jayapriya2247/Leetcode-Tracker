// Last updated: 7/9/2026, 3:06:14 PM
class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int minsum=0;
        int maxsum=0;
        int n=nums.length;
        for(int i=0;i<k;i++){
            minsum+=nums[i];
        }
        for(int i=n-k;i<n;i++){
            maxsum+=nums[i];
        }
        return Math.abs(maxsum-minsum);
    }
}