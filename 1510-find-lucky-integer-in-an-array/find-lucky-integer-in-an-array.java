import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findLucky(int[] arr) {
        int num = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getKey().equals(entry.getValue())) {
                num = Math.max(num, entry.getKey());
            }
        }

        return num;
    }
}
