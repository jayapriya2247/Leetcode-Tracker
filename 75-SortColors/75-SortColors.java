// Last updated: 7/9/2026, 3:08:43 PM
class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int i = 0;
        int k = n - 1; 
        int j = 0; 
        
        
        while(j <= k) {
            if(nums[j] == 0) {
                swap(nums, i++, j++);
            } else if(nums[j] == 2) {
                swap(nums, j, k--);
            } else {
                j++;
            }
        }
    }
    
    public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}