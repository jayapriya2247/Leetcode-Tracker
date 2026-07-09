// Last updated: 7/9/2026, 3:06:55 PM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drink = numBottles;
        int empty = numBottles;
        while(empty>=numExchange){
            int newD = empty/numExchange;
            drink+=newD;
            empty = (empty%numExchange)+newD;
        }
        return drink;
        
        
    }
}