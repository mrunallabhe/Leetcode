class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int maxans=0;
        Set<Character> ch=new HashSet<>();
        for(int r=0;r<s.length();r++){
            while(ch.contains(s.charAt(r))){
                ch.remove(s.charAt(l));
                l++;
            }
            ch.add(s.charAt(r));
            maxans=Math.max(maxans,r-l+1);

        }
        return maxans;
    }
}