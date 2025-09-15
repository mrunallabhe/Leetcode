class Solution {
    public int findKthPositive(int[] arr, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }

        int count = 0;
        int element = 0;
        int m = arr[arr.length - 1];
        for (int j = 1; j <= m; j++) {
            if (!set.contains(j)) {
                count++;
                if (count == k) {
                    return j;  
                }
            }
        }
        return m + (k - count);
    }
}
