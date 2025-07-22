import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = p.length();
        char[] c = p.toCharArray();
        Arrays.sort(c); 
        String sortedP = new String(c);

        for (int i = 0; i <= s.length() - n; i++) {
            String sub = s.substring(i, i + n);
            char[] c1 = sub.toCharArray();
            Arrays.sort(c1);
            String sortedSub = new String(c1);
            if (sortedP.equals(sortedSub)) { 
                ans.add(i);
            }
        }

        return ans;
    }
}
