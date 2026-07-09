// Last updated: 7/9/2026, 3:06:07 PM
class Solution {
    public int minAllOneMultiple(int k) {
        if(k%2==0||k%5==0){
            return -1;
        }
        int remainder = 1%k;
        int length = 1;
        while(remainder!=0){
            remainder = (remainder*10+1)%k;
            length++;
                
        }
        return length;
        
    }
}