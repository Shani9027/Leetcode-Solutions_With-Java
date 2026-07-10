import java.util.Arrays;

class Solution {
    public int[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {

        int[][] pairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            pairs[i][0] = nums[i];
            pairs[i][1] = i;
        }

        Arrays.sort(pairs, (a, b) -> Integer.compare(a[0], b[0]));

        int m = 20;
        int[][] f = new int[n][m];

        int r = 0;
        for (int l = 0; l < n; l++) {
            while (r < n && pairs[r][0] - pairs[l][0] <= maxDiff) {
                r++;
            }

            int currentIdx = pairs[l][1];
            int nextIdx = pairs[r - 1][1];
            f[currentIdx][0] = nextIdx;
        }

        for (int k = 1; k < m; k++) {
            for (int i = 0; i < n; i++) {
                f[i][k] = f[f[i][k - 1]][k - 1];
            }
        }

        int[] ans = new int[queries.length];

        for (int t = 0; t < queries.length; t++) {
            int u = queries[t][0];
            int v = queries[t][1];

            if (u == v) {
                ans[t] = 0;
                continue;
            }

            if (nums[u] > nums[v]) {
                int tmp = u;
                u = v;
                v = tmp;
            }

            if (nums[u] == nums[v]) {
                ans[t] = 1;
                continue;
            }

            int steps = 0;

            for (int k = m - 1; k >= 0; k--) {
                int nextNode = f[u][k];

                if (nums[nextNode] < nums[v]) {
                    u = nextNode;
                    steps += (1 << k);
                }
            }

            u = f[u][0];
            steps += 1;

            if (nums[u] >= nums[v]) {
                ans[t] = steps;
            } else {
                ans[t] = -1;
            }
        }

        return ans;
    }
}
