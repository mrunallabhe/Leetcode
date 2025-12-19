class Solution {
    public void moveZeroes(int[] nums) {
        int s = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] != 0 && nums[s] == 0) {
                swap(nums, s, i);
                s++;
            } else if (nums[s] != 0) {
                s++;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
