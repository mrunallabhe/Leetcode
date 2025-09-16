import java.util.*;

class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        // build frequency map from licensePlate
        Map<Character, Integer> target = new HashMap<>();
        for (char ch : licensePlate.toCharArray()) {
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);
                target.put(ch, target.getOrDefault(ch, 0) + 1);
            }
        }

        String answer = null;

        for (String word : words) {
            if (isCompletingWord(word, target)) {
                if (answer == null || word.length() < answer.length()) {
                    answer = word;
                }
            }
        }

        return answer;
    }

    // check if word satisfies target requirements
    private boolean isCompletingWord(String word, Map<Character, Integer> target) {
        Map<Character, Integer> count = new HashMap<>();
        for (char ch : word.toCharArray()) {
            count.put(ch, count.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : target.entrySet()) {
            char key = entry.getKey();
            int required = entry.getValue();
            if (count.getOrDefault(key, 0) < required) {
                return false;
            }
        }
        return true;
    }
}
