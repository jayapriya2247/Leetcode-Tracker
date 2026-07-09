// Last updated: 7/9/2026, 3:08:17 PM
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalCost = 0, remGas = 0, startStation = 0;
        for(int i =0;i<gas.length;i++){
            int diff = gas[i] - cost[i];
            totalCost += diff;
            remGas += diff;
        if(remGas<0){
            startStation = i+1;
            remGas = 0;

            }
        }
        return totalCost>=0? startStation:-1;
    }
}