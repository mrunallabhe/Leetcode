class Solution {
    public boolean isValid(String word) {
        int vowelcount = 0;
        int consonantcount = 0;

        if (word.length() < 3) return false; // Check total length first

        for (char c : word.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }

            if (Character.isLetter(c)) {
                char lower = Character.toLowerCase(c);
                if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                    vowelcount++;
                } else {
                    consonantcount++;
                }
            }
        }

        return vowelcount >= 1 && consonantcount >= 1;
    }
}
