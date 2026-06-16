class Solution {
    public String longestPalindrome(String s) {
        if(s.length() < 2){
            return s;
        }
        String result = "";
        for(int i = 0 ; i < s.length() ; i++){
            for(int j = i+1 ; j <= s.length() ; j++){
                String org = s.substring(i,j);
                StringBuilder sb = new StringBuilder(s.substring(i,j));
                sb.reverse();
                if(org.equals(sb.toString())){
                    if(org.length()>result.length())
                    result = org;
                }
            }
        }
        return result;
    }
}