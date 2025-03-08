class Solution {
    public long mostPoints(int[][] questions) {
        return sumcal(questions, 0, new Long[questions.length]);  // Added memoization array
    }

    private static long sumcal(int[][] questions, int index, Long[] dp) {
        if (index >= questions.length) return 0;  // Base case

        if (dp[index] != null) return dp[index];  // Return cached result

        // Fix: Correctly compute 'take' using 'brainpower' value
        long take = questions[index][0] + sumcal(questions, index + 1 + questions[index][1], dp);
        long nottake = sumcal(questions, index + 1, dp);

        return dp[index] = Math.max(take, nottake);  // Store and return result
    }
}
