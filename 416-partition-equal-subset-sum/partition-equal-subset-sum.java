class Solution {
    public boolean canPartition(int[] nums) {
        int sum = Arrays.stream(nums).sum(); // Efficient way to compute sum
        int n = nums.length;

        // If the total sum is odd, it can't be divided into two equal subsets
        if (sum % 2 != 0) return false;

        int k = sum / 2;
        Boolean[][] dp = new Boolean[n][k + 1]; // Memoization table

        return findsum(nums, n - 1, k, dp);
    }

    private boolean findsum(int[] nums, int index, int k, Boolean[][] dp) {
        if (k == 0) return true;  // Found a valid subset
        if (index < 0 || k < 0) return false; // Base case: Invalid cases

        if (dp[index][k] != null) return dp[index][k]; // Return memoized result

        boolean notTaken = findsum(nums, index - 1, k, dp);
        boolean taken = false;

        if (nums[index] <= k) {
            taken = findsum(nums, index - 1, k - nums[index], dp);
        }

        return dp[index][k] = taken || notTaken; // Memoize and return
    }
}