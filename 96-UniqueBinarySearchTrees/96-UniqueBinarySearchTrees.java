// Last updated: 7/9/2026, 3:08:29 PM
class Solution {
     private HashMap<Integer, Integer>memo = new HashMap<>();
    public int numTrees(int n) {
        
        if(n==0 || n==1) return 1;
        if(memo.containsKey(n)){
            return memo.get(n);
        }
        int total = 0;
        for(int root=1;root<=n;root++){
            int left = numTrees(root-1);
            int right = numTrees(n-root);
            total += left*right;

        }
        memo.put(n,total);
        return total;
        
    }
}