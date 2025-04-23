class Solution {
    public int[] numberOfPairs(int[] nums) {
        int[] m = new int[2];
        Map<Integer, Integer> result = new HashMap<>();
        
        // Count frequency of each number
        for (int num : nums) {
            result.put(num, result.getOrDefault(num, 0) + 1);
        }

        int pairs = 0;
        int leftovers = 0;

        // Count pairs and leftovers
        for (int freq : result.values()) {
            pairs += freq / 2;
            leftovers += freq % 2;
        }

        m[0] = pairs;
        m[1] = leftovers;
        return m;
    }
}
