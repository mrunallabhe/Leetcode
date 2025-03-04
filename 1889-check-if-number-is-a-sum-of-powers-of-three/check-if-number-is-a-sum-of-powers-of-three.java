class Solution {
    public boolean checkPowersOfThree(int n) {
        return functionPow(0, 0, n);
    }

    private static boolean functionPow(int power, int sum, int n) {
        if (sum == n) return true; 
        if (sum > n || Math.pow(3, power) > n) return false; 
     
        boolean notTaken = functionPow(power + 1, sum, n);
        boolean taken = functionPow(power + 1, sum + (int) Math.pow(3, power), n);
        
        return taken || notTaken;
    }
}
