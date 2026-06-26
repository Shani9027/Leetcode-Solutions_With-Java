class Solution {
    public long countMajoritySubarrays(int[] nums, int target) {
        int validPoint = 0;
        int sum = 0;
        HashMap<Integer , Integer> map = new HashMap<>();
        map.put( 0 , 1 );
        long result = 0;
        for( int i = 0 ; i < nums.length ; i++ ){
            if( nums[i] == target ){
                validPoint += map.getOrDefault(sum , 0);
                sum += 1;
            }else {
                sum -= 1;
                validPoint -= map.getOrDefault(sum , 0);
            }
            map.put(sum , map.getOrDefault(sum , 0) + 1);
            result += (long)validPoint;
        }
        return (long)result;
    }
}
