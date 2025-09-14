class Solution {
    public int maxProduct(int[] nums) {
        int maxSoFar = nums[0];   // max product of subarray ending at i
        int minSoFar = nums[0];   // min product of subarray ending at i
        int result = nums[0];     // global max

        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];

            // If curr is negative, multiplying swaps max and min roles
            if (curr < 0) {
                int tmp = maxSoFar;
                maxSoFar = minSoFar;
                minSoFar = tmp;
            }

            // Either start here (curr) or extend previous product
            maxSoFar = Math.max(curr, maxSoFar * curr);
            minSoFar = Math.min(curr, minSoFar * curr);

            // Update global best
            result = Math.max(result, maxSoFar);
        }

        return result;
    }
}
