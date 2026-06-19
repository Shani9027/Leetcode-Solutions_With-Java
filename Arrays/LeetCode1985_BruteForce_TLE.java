class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        int N = nums.length ;
        for(int i = 0 ; i < N ; i++ ){
            for(int j = i+1 ; j < N ; j++){
                if( nums[i].length() == nums[j].length() ){
                    for(int l = 0 ; l < nums[i].length() ; l++ ){
                    if(nums[i].charAt(l) > nums[j].charAt(l)) break;
                    if(  nums[i].charAt(l) < nums[j].charAt(l) ){
                        String temp = nums[i];
                         nums[i] = nums[j];
                         nums[j] = temp;
                         break;
                        }
                    }
                }else if(nums[i].length() < nums[j].length() ){
                    String temp = nums[i];
                     nums[i] = nums[j];
                     nums[j] = temp;
                }
            }
        }
        return nums[k-1];
    }
}