class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;

        // Step 1: Sort intervals by start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();

        // Step 2: Initialize start and end
        int start = intervals[0][0];
        int end = intervals[0][1];

        // Step 3: Traverse the rest of the intervals
        for (int i = 1; i < intervals.length; i++) {
            // If the current interval overlaps with the previous one
            if (intervals[i][0] <= end) {
                // Merge by updating the end
                end = Math.max(end, intervals[i][1]);
            } else {
                // No overlap, add the previous interval
                merged.add(new int[]{start, end});
                // Update start and end to current interval
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }

        // Add the last interval
        merged.add(new int[]{start, end});

        // Convert list to array
        return merged.toArray(new int[merged.size()][]);
    }
    }
