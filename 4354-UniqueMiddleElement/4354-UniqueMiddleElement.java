// Last updated: 7/9/2026, 3:06:00 PM
class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n = nums.length;
        int midValue = nums[n / 2];
        int count = 0;
        for( int num:nums){
            if(num == midValue){
                count++;
            }
        }
        return count == 1;
        
    }
}