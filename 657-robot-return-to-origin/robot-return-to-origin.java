import java.util.*;

class Solution {
    public boolean judgeCircle(String moves) {
        Map<Character, Integer> result = new HashMap<>();
        
        for (int i = 0; i < moves.length(); i++) {
            char move = moves.charAt(i);
            result.put(move, result.getOrDefault(move, 0) + 1);
        }

        return result.getOrDefault('U', 0).equals(result.getOrDefault('D', 0)) &&
               result.getOrDefault('L', 0).equals(result.getOrDefault('R', 0));
    }
}
