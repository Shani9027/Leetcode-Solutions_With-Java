class Solution {
    public boolean judgeSquareSum(int c) {
        int r = (int)Math.sqrt(c);
        int l = 0 ;
        while ( l <= r ){
            long temp = (long)(l*l) + (r*r) ;
            if( temp == (long) c ){
                return true ;
            }
            if( temp < (long) c ){
                l++;
            }else{
                r--;
            }
        }
        return false ;
    }
}