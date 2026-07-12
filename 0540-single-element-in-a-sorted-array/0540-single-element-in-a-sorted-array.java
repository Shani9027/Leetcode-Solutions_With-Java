class Solution {
    public int singleNonDuplicate(int[] nums) {
       
        int left = 0;
        int right = nums.length ;
        int ans = -1;
        while( left < right ){
            int mid = ( left+right ) / 2 ;
            if( mid-1 >= 0 && nums[mid-1] == nums[mid] ){ 
                if( (mid-1) % 2 == 1 ){ 
                right = mid - 1 ;
                }else{
                    left = mid;
                }
            }else if( mid+1 < nums.length && nums[mid] == nums[mid+1] ){
                if( mid % 2 == 0 ){
                left = mid + 1;
                }else{
                    right = mid;
                }
            }else{
                return nums[mid];
            }
        }
        return -1;
    }
}