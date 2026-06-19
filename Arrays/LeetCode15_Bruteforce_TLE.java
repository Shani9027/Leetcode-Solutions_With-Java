class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       
        List<List<Integer>> listlist = new ArrayList<>();
        int N = nums.length;
        for(int i = 0 ; i < N ; i++ ){
            for(int j = i+1 ; j < N ; j++){
                for(int k = j+1 ; k < N ; k++){
                    if(nums[i]+nums[j]+nums[k] == 0){
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        Collections.sort(list);
                        if(!listlist.contains(list)){
                            listlist.add(list);
                        }
                    }
                }
            }
        }
        return listlist;
    }
}