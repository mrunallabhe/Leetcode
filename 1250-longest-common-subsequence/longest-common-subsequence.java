import java.util.Arrays;

class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int ind1 = text1.length();
        int ind2 = text2.length();
        
        // Initialize dp array with -1 (for memoization)
        int[][] dp = new int[ind1][ind2];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        
        return lcsutils(text1, text2, ind1 - 1, ind2 - 1, dp);
    }

    static int lcsutils(String text1, String text2, int ind1, int ind2, int[][] dp) {
        if (ind1 < 0 || ind2 < 0) return 0;

        // If already computed, return from memoization table
        if (dp[ind1][ind2] != -1) return dp[ind1][ind2];

        if (text1.charAt(ind1) == text2.charAt(ind2)) {
            return dp[ind1][ind2] = 1 + lcsutils(text1, text2, ind1 - 1, ind2 - 1, dp);
        } else {
            return dp[ind1][ind2] = Math.max(
                lcsutils(text1, text2, ind1, ind2 - 1, dp), 
                lcsutils(text1, text2, ind1 - 1, ind2, dp)
            );
        }
    }
}
