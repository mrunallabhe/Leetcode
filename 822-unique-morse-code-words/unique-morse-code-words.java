class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String code[] = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
            "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
            "..-", "...-", ".--", "-..-", "-.--", "--.."
        };

        HashSet<String> set = new HashSet<>();
        StringBuilder sb;

        for (int i = 0; i < words.length; i++) {
            sb = new StringBuilder(); 
            for (int j = 0; j < words[i].length(); j++) {
                sb.append(code[words[i].charAt(j) - 'a']);
            }
            set.add(sb.toString());
        }

        return set.size();
    }
}