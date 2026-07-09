// Last updated: 7/9/2026, 3:06:22 PM
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int icount = 0;
        for(int i=0;i<hours.length;i++){
            if(hours[i]>=target){
                icount++;
            }
        }
        return icount;
        
    }
}