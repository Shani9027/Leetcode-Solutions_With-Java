class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        dfs(res, sb, 0, 0, n);
        
        return res;
    }

    private void dfs(List<String> res, StringBuilder sb, int open, int close, int n) {
        //System.out.println(sb.toString());
        if (open == n && open == close) {
            res.add(sb.toString());
        }

        if (open < n) {
            sb.append("(");
            dfs(res, sb, open + 1, close, n);
        }

        if (close < open) {
            sb.append(")");
            dfs(res, sb, open, close + 1, n);
        }

        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
