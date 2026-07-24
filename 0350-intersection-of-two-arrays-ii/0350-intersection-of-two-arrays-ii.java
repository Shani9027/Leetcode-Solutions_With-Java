class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>(); 
        List<Integer> list = new ArrayList<>();
        if( nums1.length < nums2.length ){
            for( int i : nums1 )
                map.put( i , map.getOrDefault( i , 0 ) + 1 );
            for( int i : nums2 )
                if( map.containsKey( i ) && map.get(i) != 0 ){
                    list.add(i);
                    map.put( i , map.get(i) - 1 );
                }
        }else{
             for( int i : nums2 )
                map.put( i , map.getOrDefault( i , 0 ) + 1 );
            for( int i : nums1 )
                if( map.containsKey( i ) && map.get(i) != 0 ){
                    list.add(i);
                    map.put( i , map.get(i) - 1 );
                }
        }
        int[] arr = new int[list.size()];
        for( int i = 0 ; i < list.size() ; i++ ) arr[i] = list.get(i);
        return arr;
    }
}