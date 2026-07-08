class Solution {
public:
   
   int solve(vector<int>&nums , int idx , int prev , vector<vector<int>>&dp){

        if(idx >= nums.size()){
             return 0;
        }

        if(dp[prev+1][idx] != -1){
             return dp[prev+1][idx];
        }

        int left = 0, right = 0;
        if(prev == -1 || nums[prev] < nums[idx]){
           left = 1 + solve(nums , idx + 1 , idx , dp);
        }

        right =  solve(nums , idx + 1, prev , dp);

        return dp[prev+1][idx] =  max(left , right);

   }
    int lengthOfLIS(vector<int>& nums) {
        int size = nums.size();
        vector<vector<int>>dp(size + 1 , vector<int>(size + 1  , -1));
        return solve(nums , 0 , -1 , dp);
    }
}; 