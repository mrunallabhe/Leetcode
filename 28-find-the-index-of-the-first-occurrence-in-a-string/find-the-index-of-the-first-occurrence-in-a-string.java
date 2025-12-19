class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;

        int n = haystack.length();
        int m = needle.length();

        for (int i = 0; i <= n - m; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                int index = 0;

                while (index < m && haystack.charAt(i + index) == needle.charAt(index)) {
                    index++;
                }

                if (index == m) {
                    return i;
                }
            }
        }
        return -1;
    }
}
