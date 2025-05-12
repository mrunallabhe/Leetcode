import java.util.*;

class Solution {
    public int countPoints(String rings) {
        Map<Character, Set<Character>> map = new HashMap<>();
        for (int i = 0; i < rings.length(); i += 2) {
            char color = rings.charAt(i);       // 'R', 'G', or 'B'
            char rod = rings.charAt(i + 1);     // '0' to '9'

            map.putIfAbsent(rod, new HashSet<>());
            map.get(rod).add(color);
        }

        int count = 0;
        for (Set<Character> colors : map.values()) {
            if (colors.size() == 3) {
                count++;
            }
        }

        return count;
    }
}
