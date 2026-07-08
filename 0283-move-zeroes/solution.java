class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 1;
        while(j<nums.length){
            if(nums[i]==0){
                while(j<nums.length-1){
                    if(nums[j]!=0){
                        break;
                    } j++;
                }
                int a = nums[i];
                    nums[i] = nums[j];
                    nums[j] = a;
            }
            i++;
            j=i+1;
        }
    }
}
