class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        // Step 1: Sort by end time
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

        int count = 0; // non-overlapping intervals kept
        int prevEnd = Integer.MIN_VALUE;

        // Step 2: Greedy selection
        for (int[] interval : intervals) {
            if (interval[0] >= prevEnd) {
                count++;
                prevEnd = interval[1];
            }
        }

        // Step 3: total - kept
        return intervals.length - count;
    }
}