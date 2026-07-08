class Solution {
    public int mySqrt(int x) {
        if( x == 0 || x == 1 ) return x;
        long mid = 0 , left = 1 , right = x , answer = 0 ; 
        while(left <= right ){
            mid = (right + left)/2 ;
            if( mid == (x/mid) ){
                return (int)mid;
            }
            if( mid > (x/mid) ){
                right = mid - 1 ;
            }else{
                left = mid + 1 ;
                answer = mid;
            }
        }
        return (int)answer;
    }
}
