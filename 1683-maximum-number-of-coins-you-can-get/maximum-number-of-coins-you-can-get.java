class Solution {
    public static int maxCoins(int[] piles) {
        Arrays.sort(piles); // sort ascending
        int n = piles.length / 3;
        int ans = 0;
        int right = piles.length - 2; // start from second largest
        // Pick n piles for yourself
        for (int i = 0; i < n; i++) {
            ans += piles[right];
            right -= 2; // skip Alice's and Bob's pick
        }
        return ans;
    }
}