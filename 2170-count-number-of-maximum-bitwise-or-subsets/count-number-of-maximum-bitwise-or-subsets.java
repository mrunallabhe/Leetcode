class Solution {
    int maxOR = 0;
    int count = 0;

    public int countMaxOrSubsets(int[] nums) {
        dfs(nums, 0, 0);
        return count;
    }

    private void dfs(int[] nums, int idx, int currOR) {
        if (idx == nums.length) {
            if (currOR == maxOR) count++;
            else if (currOR > maxOR) {
                maxOR = currOR;
                count = 1;
            }
            return;
        }

        // Include nums[idx]
        dfs(nums, idx + 1, currOR | nums[idx]);

        // Exclude nums[idx]
        dfs(nums, idx + 1, currOR);
    }
}
