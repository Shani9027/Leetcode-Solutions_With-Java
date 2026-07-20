class Solution {
    private int calculateGCD( int a , int b ){
        if( b == 0 ) return a;
        return calculateGCD( b , a%b );
    }
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for( int i = 0 ; i < nums.length ; i++ ){
            if( min > nums[i] ) min = nums[i];
            if( max < nums[i] ) max = nums[i];
        }
        int gcd = calculateGCD( min, max );
        return gcd;
    }
}