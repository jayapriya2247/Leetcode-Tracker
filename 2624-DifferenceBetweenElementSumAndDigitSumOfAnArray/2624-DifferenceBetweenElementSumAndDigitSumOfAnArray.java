// Last updated: 7/9/2026, 3:06:34 PM
class Solution {
    public int differenceOfSum(int[] nums) {
        int esum=0,dsum=0;
        for(int x:nums){
            esum+=x;
            while(x!=0){
                dsum+=x%10;
                x/=10;
            }

        }
        return Math.abs(esum-dsum);






        
    }
}