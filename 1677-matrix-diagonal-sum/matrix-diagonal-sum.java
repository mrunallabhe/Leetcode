class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j) {  // primary diagonal
                    sum += mat[i][j];
                }
                if (i + j == n - 1) { // secondary diagonal
                    sum += mat[i][j];
                }
            }
        }

        // subtract the middle element once if n is odd
        if (n % 2 == 1) {
            sum -= mat[n / 2][n / 2];
        }

        return sum;
    }
}
