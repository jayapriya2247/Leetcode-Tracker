// Last updated: 7/9/2026, 3:06:19 PM
class Solution {
    public boolean canAliceWin(int[] nums) {
        int sumSingle = 0;
        int sumDouble = 0;
        int totalSum = 0;
        for (int num : nums){
            totalSum +=num;
            if (num >= 1 && num <= 9){
                sumSingle += num;
            } else if (num >= 10 && num <= 99){
                sumDouble += num;
            
            }
        }
        return sumSingle > totalSum - sumSingle || sumDouble > totalSum - sumDouble;
    }
}