class Solution {
    public int[][] merge(int[][] intervals) {

        int n = intervals.length;
        if (n == 0) return new int[0][0];

        
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        ArrayList<int[]> arr = new ArrayList<>();

        for (int i = 0; i < n - 1; i++) {

           
            if (intervals[i][1] >= intervals[i + 1][0]) {

                
                intervals[i + 1][0] = intervals[i][0];
                intervals[i + 1][1] = Math.max(intervals[i][1], intervals[i + 1][1]);

            } else {
               
                arr.add(new int[]{intervals[i][0], intervals[i][1]});
            }
        }

       
        arr.add(new int[]{intervals[n - 1][0], intervals[n - 1][1]});

        return arr.toArray(new int[arr.size()][]);
    }
}
