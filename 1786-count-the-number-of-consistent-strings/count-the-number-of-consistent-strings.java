class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> map = new HashSet<>();
        for (int i = 0; i < allowed.length(); i++) { 
            map.add(allowed.charAt(i));
        }

        int count = 0;
        for (String s : words) {
            boolean isValid = true;
            for (char ch : s.toCharArray()) { 
                if (!map.contains(ch)) { 
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                count++; 
            }
        }

        return count;
    }
}
