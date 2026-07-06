class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort( intervals ,( a, b ) -> {
            if( a[0] == b[0] ){
              return Integer.compare(b[1], a[1]);
            }
              return Integer.compare(a[0], b[0]);
        } );
        int ans = intervals.length;
        int maxEnd = Integer.MIN_VALUE;
        for( int i = 0 ; i < intervals.length ; i++ ){
            if( maxEnd >= intervals[i][1] ) ans--;
            if( maxEnd <= intervals[i][1] ){
                maxEnd = intervals[i][1];
            }
        }
        return ans;
    }
}
