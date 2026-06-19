class Solution {
    public int largestAltitude(int[] gain) {
        int longest = 0;
        int current = 0;
        for(int i = 0 ; i < gain.length ; i++ ){
        current = current + gain[i];
        longest = Math.max(longest , current );
        }
        return longest;
    }
}