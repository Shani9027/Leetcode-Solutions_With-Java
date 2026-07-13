class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String num = "123456789";
        ArrayList<Integer> list = new ArrayList<>();
        for( int i = 0 ; i < num.length() ; i++ ){
            for( int j = i+1 ; j <= num.length() ; j++ ){
                int ans = Integer.parseInt(num.substring(i,j));
                if( low <= ans && ans <= high ){
                    list.add(ans);
                }
            }
        }
        Collections.sort(list);
        return list;
    }
}