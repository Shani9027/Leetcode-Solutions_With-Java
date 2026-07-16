class Solution {
    private int calculateGCD( int a , int b ){
        while( b!= 0 ){
            int temp = a;
            a = b;
            b = temp%b;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int max = 0;
        int[] gcd = new int[nums.length];
        for( int i = 0 ; i < nums.length ; i++ ){
            max = Math.max( max , nums[i] );
            gcd[i] = calculateGCD( max , nums[i] );
        }
        Arrays.sort(gcd); //O( nlogn )
        int left = 0;
        int right = gcd.length - 1;
        long ans = 0;
        while( left < right ){
            ans = ans + calculateGCD( gcd[left] , gcd[right] );
            left++;
            right--;
        } 
        return ans;
    }
}