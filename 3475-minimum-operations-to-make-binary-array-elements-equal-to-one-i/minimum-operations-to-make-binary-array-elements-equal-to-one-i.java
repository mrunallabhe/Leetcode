class Solution {
    public int minOperations(int[] nums) {
        int r = 0, l = 0;
        int count = 0;
        int k = 0;

        while (r <= nums.length - 3) { 
            if (nums[l] == 0) { 
                for (int i = 0; i < 3; i++) {
                    nums[r + i] = (nums[r + i] == 0) ? 1 : 0; 
                }
                count++; 
            }
            r++;
            l++;
        }

        for (int num : nums) {
            if (num == 0) return -1;
        }

        return count;
    }
}
