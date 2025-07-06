class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        
        // Traverse both strings
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;  // Move s pointer only if match found
            }
            j++;  // Always move t pointer
        }
        
        // If i has traversed the whole s, it's a subsequence
        return i == s.length();
    }
}
