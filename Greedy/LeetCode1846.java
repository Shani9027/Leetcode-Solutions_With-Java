class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        int currentMax = 0;
        for(int i : arr){
            currentMax = Math.min(i , currentMax+1);
        }
        return currentMax;
     }
}