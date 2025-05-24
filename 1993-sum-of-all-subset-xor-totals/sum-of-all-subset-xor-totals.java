class Solution {
    public int subsetXORSum(int[] nums) {
        return helper(nums, 0, 0);
    }

    // Recursive helper to explore all subsets
    private int helper(int[] nums, int index, int currentXOR) {
        if (index == nums.length) {
            return currentXOR;
        }

        // Include current element
        int with = helper(nums, index + 1, currentXOR ^ nums[index]);

        // Exclude current element
        int without = helper(nums, index + 1, currentXOR);

        return with + without;
    }
}
