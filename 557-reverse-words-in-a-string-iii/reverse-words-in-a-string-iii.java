class Solution {
    public String reverseWords(String s) {
        String[] words=s.split(" ");
        StringBuilder result=new StringBuilder();
        for(String word:words){
            StringBuilder reverd=new StringBuilder(word).reverse();
            result.append(reverd).append(" ");
        }
        result.deleteCharAt(result.length()-1);
        return result.toString();
    }
}