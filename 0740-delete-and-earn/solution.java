class Solution {
    public int deleteAndEarn(int[] nums) {
        int max = Integer.MIN_VALUE;
        for( int i : nums ){
            max = Math.max( i , max );
        }
        int[] rob = new int[max+1];

        for( int i = 0 ; i < nums.length ; i++ ){
             rob[ nums[i] ] += nums[i];
        }
        int n = 0;
        int m = 0;
        for( int i = 0 ; i < max+1 ; i++ ){
            int temp = Math.max( n , m + rob[i] );
            m = n;
            n = temp;
        }
        return n;
    }
}
