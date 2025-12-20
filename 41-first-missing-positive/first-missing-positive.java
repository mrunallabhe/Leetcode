class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // store positive numbers & track min/max
        for (int num : nums) {
            if (num > 0) {
                set.add(num);
                min = Math.min(min, num);
                max = Math.max(max, num);
            }
        }

        // if 1 is missing
        if (!set.contains(1)) {
            return 1;
        }

        // check missing in range
        for (int i = min; i <= max; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        // all present
        return max + 1;
    }
}
