class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] temp = arr.clone();
        Arrays.sort(temp);
        int rank = 1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for( int i = 0 ; i < temp.length ; i++ ){
            if(!map.containsKey(temp[i])){
            map.put(temp[i] , rank);
            rank++;
            }
        }
        int[] result = new int[arr.length];
        for( int i = 0 ; i < arr.length ; i++ ){
            result[i] = map.get(arr[i]);
        }
        return result;
    }
}