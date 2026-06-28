class Solution {
    public boolean isTrionic(int[] nums) {
        int i = 0;
        int p = 0;
        int q = 0;
        int n = 0;
        while( nums.length-1 > i && nums[i] < nums[i+1] ){
            i++;
            p++;
        }
        if( p == 0 ) return false;
        while(nums.length-1 > i && nums[i] > nums[i+1] ){
            i++;
            q++;
        }
        if( q == 0 ) return false;
        while(nums.length-1 > i && nums[i] < nums[i+1] ){
            i++;
            n = 1;
        }
        if( i == nums.length-1 && n==1 ){
            return true;
        }
        return false;
    }
}
