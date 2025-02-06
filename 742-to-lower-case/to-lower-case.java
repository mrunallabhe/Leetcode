class Solution {
    public String toLowerCase(String s) {
        int len = s.length();
        StringBuilder str = new StringBuilder();
        for(int i=0; i<len; i++){
            if(s.charAt(i) >= 65 && s.charAt(i) <= 90)
                str.append((char)(s.charAt(i) + 32));
            else
                str.append(s.charAt(i));
        }
        return str.toString();
    }
}