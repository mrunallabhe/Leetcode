import java.util.*;

public class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        Set<String> set = new HashSet<>(dictionary);
        StringBuilder sb = new StringBuilder();

        for (String word : sentence.split(" ")) {
            String replacement = word;
            for (int i = 1; i <= word.length(); i++) {
                String prefix = word.substring(0, i);
                if (set.contains(prefix)) {
                    replacement = prefix;
                    break; // shortest root found
                }
            }
            if (sb.length() > 0) sb.append(" ");
            sb.append(replacement);
        }

        return sb.toString();
    }
}
