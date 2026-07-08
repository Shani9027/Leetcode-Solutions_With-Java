class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int Drink = numBottles;
        int empty = numBottles;

        while( empty >= numExchange ){
            Drink++;
            empty = 1 + empty - numExchange; 
        }
        return Drink;
    }
}
