class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        int rem = 0 ;
        while(0<n){
            rem = n % 2;
            if(rem == 1){
                count++;
            }
            n = n/2;
        }
        return count;
    }
}
