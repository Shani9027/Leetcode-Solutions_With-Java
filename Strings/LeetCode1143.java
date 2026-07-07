class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()][text2.length()];
        for (int[] row: dp) Arrays.fill(row , -1);
        return solve( text1 , text2 , text1.length() , text2.length() , dp );
    }
    private int solve( String a , String b , int n , int m , int[][] dp ){
        if( n==0 || m==0 ) return 0;

        if( dp[n-1][m-1] != -1 ) return dp[n-1][m-1];

        if( a.charAt(n-1) == b.charAt(m-1) ){ 
           return solve( a , b , n-1 , m-1 , dp ) + 1;
        }
           return dp[n-1][m-1] = Math.max( solve( a , b , n-1 , m , dp) , solve( a , b , n , m-1 , dp )  );
    } 
}