class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;

        int len = 0;
        int maxlen = 0;
        int right = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;

        while (right < s.length()) {
            char ch = s.charAt(right);

            if (map.containsKey(ch) && map.get(ch) >= left) {
                left = map.get(ch) + 1; // shift left pointer
            }

            map.put(ch, right);

            len = right - left + 1;
            maxlen = Math.max(maxlen, len);

            right++;
        }

        return maxlen;
    }
}
