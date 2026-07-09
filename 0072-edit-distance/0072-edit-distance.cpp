class Solution {
public:
    int solve(string&a , string&b , int i , int j , vector<vector<int>>&dp){

        if( i == 0){
            return j;
        }
        if(j == 0){
            return i;
        }
        if(i == 0 && j == 0){
            return 0;
        }
        if(dp[i-1][j-1] != -1){
            return dp[i-1][j-1];
        }
        int insert = 0 , dele = 0 , replace = 0;
        if(a[i - 1] == b[j - 1]){
             return solve(a , b , i - 1, j - 1 , dp);
        }
        else{
            insert = 1 + solve(a , b , i , j -1 , dp);
            dele = 1 + solve(a , b , i - 1, j , dp);
            replace = 1 + solve(a , b , i - 1 , j - 1 , dp);
        }

        return dp[i-1][j-1] =  min(insert , min(dele , replace));

    }
    int minDistance(string word1, string word2) {
        
        int n1 = word1.size();
        int n2 = word2.size();

        vector<vector<int>>dp(n1 , vector<int>(n2 , -1));

        return solve(word1 , word2, n1  , n2 , dp);
    }
};