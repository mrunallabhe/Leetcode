class Solution {
    public int minimizedStringLength(String s) {
        HashSet<Character> set1=new HashSet<>();
        for(char ch:s.toCharArray()){
            set1.add(ch);
        }
        return set1.size();
    }
}