class Solution {
    public int characterReplacement(String s, int k) {
        if(s.isEmpty() || k > s.length()) return s.length();
        int[] freq = new int[26];
        int r = 0 , l = 0 , maxLen = 0 , maxFreq = 0;
        while(r < s.length()){
            char c = s.charAt(r);
            freq[c - 'A']++;
            maxFreq = Math.max(maxFreq , freq[c-'A']);
            if((r-l+1) - maxFreq> k){
                freq[s.charAt(l) - 'A']--;
                l++;
            }
            maxLen = Math.max(maxLen , r-l+1);
            r++;
        }
        return maxLen;
    }
}