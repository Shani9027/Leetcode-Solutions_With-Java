class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> listlist = new ArrayList<>();
        int N = nums.length;
        Arrays.sort(nums);
            for(int i = 0 ; i < N ; i++){
                 int j = 1+i;
                 int k = N-1;
                if(i>0 && nums[i]==nums[i-1]) continue;
                while(k!=j && j < k){
                    int sum = nums[i]+nums[j]+nums[k];
                    if(sum == 0){
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        listlist.add(list);
                    }
                    if(sum < 0 || sum == 0){
                        ++j;
                    } if(sum > 0 || sum == 0){
                        --k;
                    }
                    if(sum == 0){
                    while(j<k && nums[j] == nums[j-1]) j++;
                    while(j<k && k<N && nums[k+1]==nums[k]) --k;
                    }
                }
            }
        return listlist;
    }
}