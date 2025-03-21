import java.util.Arrays;

class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        return targetSum(n, target, nums);
    }
        
    static int countPartitionsUtil(int ind, int target, int[] arr, int[][] dp) {
        // Base case
        if (ind == 0) {
            if (target == 0 && arr[0] == 0) return 2;
            if (target == 0 || target == arr[0]) return 1;
            return 0;
        }

        if (dp[ind][target] != -1) return dp[ind][target];

        int notTaken = countPartitionsUtil(ind - 1, target, arr, dp);
        int taken = 0;

        if (arr[ind] <= target) 
            taken = countPartitionsUtil(ind - 1, target - arr[ind], arr, dp);

        return dp[ind][target] = notTaken + taken;
    }

    static int targetSum(int n, int target, int[] arr) {
        int totSum = 0;

        for (int num : arr) 
            totSum += num;

        // Edge cases
        if (totSum < target || (totSum - target) % 2 == 1) 
            return 0;

        int s2 = (totSum - target) / 2;

        int[][] dp = new int[n][s2 + 1];
        for (int[] row : dp) 
            Arrays.fill(row, -1);

        return countPartitionsUtil(n - 1, s2, arr, dp);
    }
}
