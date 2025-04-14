import java.util.*;

class Solution {
    public List<Integer> findLonely(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }
        
        List<Integer> lonely = new ArrayList<>();
        for (int n : count.keySet()) {
            if (count.get(n) == 1              
                && !count.containsKey(n - 1)  
                && !count.containsKey(n + 1)) 
            {
                lonely.add(n);
            }
        }
        
        return lonely;
    }
}
