class Solution {
    public int reverseBits(int n) {
        int result = 0;
        int ans = 0;
        for( int i = 0 ; i < 32 ; i++ ){
        result = ( n & 1 );
        ans = ( ans << 1 )| result;
        n >>>= 1;
        }
        return ans;
    }
}
