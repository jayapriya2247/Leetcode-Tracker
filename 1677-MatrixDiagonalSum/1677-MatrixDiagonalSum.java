// Last updated: 7/9/2026, 3:06:54 PM
class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int totalSum = 0;
        for(int i=0;i<n;i++){
            totalSum+= mat[i][i];
            totalSum+=mat[i][n-i-1];
        }
        if(n%2==1){
            totalSum -= mat[n/2][n/2];
        }
        return totalSum;
        
    }
}