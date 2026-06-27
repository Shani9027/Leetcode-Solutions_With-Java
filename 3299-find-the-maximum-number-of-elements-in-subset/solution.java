class Solution {
    public int maximumLength(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for( int i : nums ){
            map.put( i , map.getOrDefault( i , 0 ) + 1 );
        }

        int max = 1;
        if( map.containsKey(1) ){
            int ones = map.get(1);
             if( ones % 2 == 0 ){
                ones--;
             }
        max = Math.max( max , ones );
        }

        for( int i : map.keySet() ){
            if( i == 1 ) continue;
            int current = 0 ;
            long curr = i;
            while( map.getOrDefault( (int)curr , 0 ) >= 2 ){
                current += 2;
                curr *= curr;
            }

            if( map.getOrDefault( (int)curr , 0 ) > 0 ){
                current += 1;
            }else{
                current -= 1;
            }

            max = Math.max( max , current );
        }
        return max;
    }
}
