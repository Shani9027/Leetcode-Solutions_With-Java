class Solution {
     private void makeSubset( int[] nums , List<Integer> order , int i , List<List<Integer>> ans ){
        // Base Case
        if( i >= nums.length ){
            ans.add( new ArrayList<>(order) );
            return;
        }
        //Exclude
        makeSubset( nums , order , i+1 , ans );
        int element = nums[i];
        order.add( element );
        //Exclude
        makeSubset( nums , order , i+1 , ans );
        order.remove(order.size()-1);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> order = new ArrayList<>();
        int index = 0;
        makeSubset(nums , order , index , ans );
        return ans;
    }
}
