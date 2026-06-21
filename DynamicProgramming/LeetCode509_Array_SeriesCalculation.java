class Solution {
    public int fib(int n) {
        if(n==0) return 0;
        int[] fibo = new int[n+1];
        // in java arr[0] = 0; (default value)
        fibo[1] = 1;
        for(int i = 2 ; i <= n ; i++){
            // Calculate Fibonacci Series
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
        return fibo[n];
    }
}