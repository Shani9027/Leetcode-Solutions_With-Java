class Solution {
    public int divide(int dividend, int divisor) {
        // Handle the absolute overflow edge case
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        
        // Determine the sign of the final result
        boolean isNegative = (dividend < 0) ^ (divisor < 0);
        
        // Use long to prevent integer overflow during Math.abs()
        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);
        
        int quotient = 0;
        
        // Fast subtraction loop
        while (absDividend >= absDivisor) {
            long tempDivisor = absDivisor;
            int multiple = 1;
            
            // Double the divisor and multiple safely
            while (absDividend >= (tempDivisor << 1)) {
                tempDivisor <<= 1;
                multiple <<= 1;
            }
            
            absDividend -= tempDivisor;
            quotient += multiple;
        }
        
        return isNegative ? -quotient : quotient;
    }
}
