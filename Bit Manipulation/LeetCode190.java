class Solution {
    public int reverseBits(int n) {
        int result = 0;
        int ans = 0;
        for( int i = 0 ; i < 32 ; i++ ){
            // Calculate Last bit
             result = ( n & 1 );
            // perform left shift on answer with or operation 
            ans = ( ans << 1 )| result;
            // Remove last bit form n by using unsigned right shift
            n >>>= 1;
        }
        return ans;
    }
}