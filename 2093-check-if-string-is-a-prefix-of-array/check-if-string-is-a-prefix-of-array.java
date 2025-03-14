class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder st = new StringBuilder();
        for (String word:words) {
            st.append(word);
            System.out.println(st);
            if (st.toString().equals(s)) {  
                return true;
            }
        }
        return false;
    }
}
