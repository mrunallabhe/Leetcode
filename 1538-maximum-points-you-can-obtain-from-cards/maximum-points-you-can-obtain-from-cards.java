class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int total = 0;

        // Take the first k cards
        for (int i = 0; i < k; i++) {
            total += cardPoints[i];
        }

        int max = total;
        // Slide the window: remove from front, add from back
        for (int i = 1; i <= k; i++) {
            total = total - cardPoints[k - i] + cardPoints[n - i];
            max = Math.max(max, total);
        }

        return max;
    }
}
