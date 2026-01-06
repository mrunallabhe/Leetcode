class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        int zerocount = map.getOrDefault(0, 0);
        int onecount  = map.getOrDefault(1, 0);
        int twocount  = map.getOrDefault(2, 0);

        // Fill 0s
        for (int i = 0; i < zerocount; i++) {
            nums[i] = 0;
        }

        // Fill 1s
        for (int j = zerocount; j < zerocount + onecount; j++) {
            nums[j] = 1;
        }

        // Fill 2s
        for (int k = zerocount + onecount; k < nums.length; k++) {
            nums[k] = 2;
        }
    }
}
