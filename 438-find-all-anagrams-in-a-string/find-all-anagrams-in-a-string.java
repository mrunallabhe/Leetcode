class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int len = p.length();
        int n = s.length();

        char[] pArr = p.toCharArray();
        Arrays.sort(pArr);

        for (int i = 0; i <= n - len; i++) {  
            StringBuilder str = new StringBuilder();
            for (int j = i; j < i + len; j++) { 
                str.append(s.charAt(j));
            }

            char[] ch = str.toString().toCharArray();
            Arrays.sort(ch);

            if (Arrays.equals(ch, pArr)) {    
                result.add(i);
            }
        }
        return result;
    }
}
