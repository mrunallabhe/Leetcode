public class Solution {
    public int countKeyChanges(String s) {
        int res = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(i + 1))) {
                res++;
            }
        }
        return res;
    }
}