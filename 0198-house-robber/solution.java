class Solution {
    public int rob(int[] nums) {
        int n = 0;
        int m = 0;
        if(nums.length == 1) return nums[0];
        for(int i = 0 ; i <= nums.length-1 ; i++){
            int temp = Math.max(n,m+nums[i]);
            m = n;
            n = temp;
        }
        return n;
    }
}
