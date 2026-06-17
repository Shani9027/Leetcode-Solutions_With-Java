 class Solution {
    public char processStr(String s, long k) {
        StringBuilder result = new StringBuilder();
        for(char st : s.toCharArray()){
            if( st == '*' && result.length() >  0 ){
                result.deleteCharAt(result.length()-1);
            }else if( st == '#'){
                if(result.length() > 0 )
                    result.append(result);
            }else if( st == '%' ){
                result.reverse();
            }else{
                result.append(st);
            }
		if(result.length()-k > k)
                break;
        }
		System.out.println(result);
        int len = result.length();
        if( len-1 < k || len == 0 ){
            return '.';
        }

        return result.charAt((int)k);
    }
}

public class Try{
        public static void main(String[] args){
            Solution s = new Solution();
            char a = s.processStr("%#bz%xum##i##vzo#pwc*#dkwbh####%uf%s*%cgppqhqa%h#l##o%ij%%cz%iga##e###u%#e####jfwx##%%*x%m*%#",6523);
            System.out.print(a);
        }
}


