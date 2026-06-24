class Solution {
    public int divide(int dividend, int divisor) {
        if( dividend == Integer.MIN_VALUE && divisor < 0 ) return Integer.MAX_VALUE;
        if( divisor == 1 ) return dividend;
        if( divisor == -1 ) return -dividend;
        int temp = dividend ;
        int temp2 = divisor;
        int quotient = 0;

        if( divisor < 0 ){
            divisor = 0 - divisor;
        }
        if( dividend < 0){
            dividend = 0 - dividend;
        }
    
        while( divisor <= dividend ){
            int count = 0;
            while( dividend >= (divisor << (count + 1)))
                count++;
            quotient += 1 << count; 
            dividend -=(divisor << count);
        }
        
        if( temp < 0 != temp2 < 0  ) return -quotient;
         return quotient;
    }
}