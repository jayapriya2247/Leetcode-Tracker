// Last updated: 7/9/2026, 3:09:20 PM
class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=target){
                return i;
            }
            

        }
        return nums.length;
        
    }
}