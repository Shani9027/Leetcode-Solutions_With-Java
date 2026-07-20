class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        boolean ans = true ;
        for( char i : s.toCharArray() ){
            if( '(' == i || '{' == i || '[' == i ){
                st.push(i);
            }
            if( i == ')' || i == ']' || i == '}' ){
                if( !st.isEmpty() && ( ( i == ')' && st.peek() == '(' ) || ( i == ']' && st.peek() == '[' ) || ( i == '}' && st.peek() == '{'  ) ) ) {
                    st.pop();
                }else{
                    ans = false ;
                }
            }
        }
        if( !st.isEmpty() ){
            ans = false;
        }
        return ans;
    }
}