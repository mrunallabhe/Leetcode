class Solution {
    public int longestPalindrome(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        int count = 0;
        boolean isOdd = false;

        for (Map.Entry<Character, Integer> it : map.entrySet()) {

            int freq = it.getValue();

            if (freq % 2 == 0) {
                count += freq;
            } else {
                count += freq - 1;  
                if (!isOdd) {       
                    count += 1;    
                    isOdd = true;
                }
            }
        }

        return count;
    }
}
