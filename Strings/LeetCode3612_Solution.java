class Solution {
    public String processStr(String s) {
        StringBuilder result = new StringBuilder();
        for(char a : s.toCharArray()){
            if( a == '*' ){
                if(result.length() > 0)
                result = result.deleteCharAt(result.length()-1);
            }else if(a == '%'){
                result.reverse();
            }else if( a == '#'){
                if(result.length() > 0 )
                result.append(result);
            }else{
                result.append(a);
            }
        }
        return result.toString();
    }
}