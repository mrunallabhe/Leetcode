class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 3) {
            if (i + 2 < nums.length && nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) {
                continue;
            } else {
                return nums[i]; 
            }
        }
        return -1; 
    }
}
