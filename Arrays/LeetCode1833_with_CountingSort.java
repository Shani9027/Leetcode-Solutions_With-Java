class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int N = costs.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<N; i++){
            if(costs[i] > max){
                max = costs[i];
            }
            if(costs[i] < min){
                min = costs[i];
            }
        }
        if(min>coins){
            return 0;
        }
        int[] count = new int[max+1];
        for(int i=0; i<max+1; i++){
            count[i] = 0;
        }
        for(int i=0; i<N; i++){
            count[costs[i]]++;
        }
        int j = 0;
        for(int i=0; i<max+1; i++){
            while(count[i] > 0){
                costs[j] = i;
                j++;
                count[i]--;
            }
        }
        int maxIceCream = 0;
        for(int i = 0 ; i < N ; i++){
            if(coins < costs[i]){
                break;
            }
            coins = coins - costs[i];
            maxIceCream++;
        }
        return maxIceCream;
    }
}