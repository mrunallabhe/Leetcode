import java.util.Hashtable;

class Solution {
    public boolean areOccurrencesEqual(String s) {
        Hashtable<Character, Integer> table = new Hashtable<>();

        for (char ch : s.toCharArray()) {
            table.put(ch, table.getOrDefault(ch, 0) + 1);
        }

        int freq = table.get(s.charAt(0));

        for (int value : table.values()) {
            if (value != freq) {
                return false;
            }
        }

        return true;
    }
}