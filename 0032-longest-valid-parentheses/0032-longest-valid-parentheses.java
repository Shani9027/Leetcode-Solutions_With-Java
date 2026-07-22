class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        int ans = 0;
        st.push(-1);
        int j = 0;
        for (char i : s.toCharArray()) {
            if (i == '(') {
                st.push(j);
            }
            if (i == ')' && !st.isEmpty()) {
                st.pop();

            }
            if (st.isEmpty())
                st.push(j);
            if (!st.isEmpty() && i == ')')
                ans = Math.max(ans, j - st.peek());
            j++;
        }
        return ans;
    }
}