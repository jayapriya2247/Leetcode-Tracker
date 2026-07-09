// Last updated: 7/9/2026, 3:06:57 PM
class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer>countMap = new HashMap<>();
        int goodpairs = 0;
        for(int num : nums){
            if(countMap.containsKey(num)){
                goodpairs += countMap.get(num);
                countMap.put(num, countMap.get(num)+1);

            } else {
                countMap.put(num,1);
            }


        }
        return goodpairs;
    }
}