class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int sum = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int count = 0;
        for(int i = 0 ; i < nums.length ; i++){
            sum = sum + nums[i];
            int rem = ((sum % k)+k)%k;
           
            count = count + map.getOrDefault(rem , 0);
            map.put(rem , map.getOrDefault(rem , 0) + 1);
        }
        map.clear();
        return count;
    }
}
