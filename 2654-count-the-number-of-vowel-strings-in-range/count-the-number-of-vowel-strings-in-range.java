class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'u', 'o'));
        int count = 0;
        for (int i = left; i <= right; i++){
            String word = words[i];
            if (vowels.contains(word.charAt(0)) && vowels.contains(word.charAt(word.length() - 1))){
                count++;
            }
        }
        return count;
    }
}
