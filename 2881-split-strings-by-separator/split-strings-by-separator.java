class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> result = new ArrayList<>();
        for (String s : words) {
            int left = 0;
            int right = 0;
            while (right < s.length()) {
                if (s.charAt(right) == separator) {
                    if (left < right) { 
                        result.add(s.substring(left, right));
                    }
                    left = right + 1;
                }
                right++;
            }
            if (left < s.length()) { 
                result.add(s.substring(left));
            }
        }
        return result;
    }
}
