import java.util.Arrays;

class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1); // Initialize memoization array
        return maxprofit(n - 1, nums, dp);
    }

    private int maxprofit(int n, int[] nums, int[] dp) {
        if (n < 0) return 0;
        if (n == 0) return nums[0];
        if (dp[n] != -1) return dp[n]; // Return cached value

        int pick = nums[n] + maxprofit(n - 2, nums, dp);
        int nonpick = maxprofit(n - 1, nums, dp);

        return dp[n] = Math.max(pick, nonpick); // Store result
    }
}
