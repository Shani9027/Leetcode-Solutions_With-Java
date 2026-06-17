class Solution {
    public char processStr(String s, long k) {
        StringBuilder result = new StringBuilder();
        for(char st : s.toCharArray()){
            if( st == '*'){
                if( result.length() >  0 )
                result.deleteCharAt(result.length()-1);
            }else if( st == '#'){
                if(result.length() > 0 )
                result.append(result);
            }else if( st == '%' ){
                result.reverse();
            }else{
                result.append(st);
            }
        }

            int len = result.length();
            if( len-1 < k || len == 0 ){
                return '.';
            }
        
       return result.charAt((int)k);
    }
}