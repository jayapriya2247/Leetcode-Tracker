// Last updated: 7/9/2026, 3:07:02 PM
class Solution {
    public int minCostToMoveChips(int[] position) {
        int evenCount = 0;
        int oddCount = 0;
        for(int p:position){
            if(p % 2==0){
               evenCount++;
            } else {
                oddCount++;
            }
            
            
        }
        return evenCount<oddCount?evenCount:oddCount; 
        
    }
}