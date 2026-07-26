class Solution {
    public int maximumProduct(int[] nums) {
        int a = Integer.MIN_VALUE ; ;
        int b = a ;
        int c = a ;
        int d = Integer.MAX_VALUE ;
        int e = d ;
        for( int i : nums ){
            if( i < d ){
                e = d ;
                d = i ;
            }else if( i < e ) e = i ;
            if( i > a ){
                c = b ;
                b = a ;
                a = i ;
            }else if( i > b ){
                c = b ;
                b = i ;
            }else if( i > c ){
                c = i ;
            }
        }
        return Math.max( a*b*c , a*d*e ) ;
    }
}