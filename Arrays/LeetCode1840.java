import java.util.Arrays;

class Solution {
    public int maxBuilding(int n, int[][] restrictions) {
        int m = restrictions.length;
        
        // Create a new array to hold original restrictions + 2 boundary constraints
        int[][] r = new int[m + 2][2];
        
        // Copy existing restrictions
        for (int i = 0; i < m; i++) {
            r[i][0] = restrictions[i][0];
            r[i][1] = restrictions[i][1];
        }
        
        // Add the base constraint for the first building
        r[m][0] = 1;
        r[m][1] = 0;
        
        // Add the theoretical max constraint for the last building
        r[m + 1][0] = n;
        r[m + 1][1] = n - 1;
        
        // Sort restrictions by building ID
        Arrays.sort(r, (a, b) -> Integer.compare(a[0], b[0]));
        
        int len = r.length;
        
        // Step 1: Propagate constraints from Left to Right
        for (int i = 1; i < len; i++) {
            int dist = r[i][0] - r[i - 1][0];
            r[i][1] = Math.min(r[i][1], r[i - 1][1] + dist);
        }
        
        // Step 2: Propagate constraints from Right to Left
        for (int i = len - 2; i >= 0; i--) {
            int dist = r[i + 1][0] - r[i][0];
            r[i][1] = Math.min(r[i][1], r[i + 1][1] + dist);
        }
        
        // Step 3: Calculate the maximum possible peak between adjacent constraints
        int maxHeight = 0;
        for (int i = 1; i < len; i++) {
            int h1 = r[i - 1][1];
            int h2 = r[i][1];
            int dist = r[i][0] - r[i - 1][0];
            
            // Mathematical intersection point of the two upward slopes
            int peak = (h1 + h2 + dist) / 2;
            maxHeight = Math.max(maxHeight, peak);
        }
        
        return maxHeight;
    }
}