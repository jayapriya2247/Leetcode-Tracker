// Last updated: 7/9/2026, 3:06:02 PM
class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int count = 0;
        int n= nums.length;
        for(int i = 0; i < n; i++){
            long currentSum = 0;
            for(int j = i; j < n; j++){
                currentSum += nums[j];
                if(isValid(currentSum, x)){
                    count++;
                }
            }
        }
        return count;
        
    }
    private boolean isValid(long sum, int x){
        long absSum = Math.abs(sum);
        int lastDigit = (int) (absSum % 10);
        if(lastDigit != x) return false;
        long temp = absSum;
        while(temp >= 10){
            temp /= 10;
        }
        int firstDigit = (int) temp;
        return firstDigit == x;
    }
}