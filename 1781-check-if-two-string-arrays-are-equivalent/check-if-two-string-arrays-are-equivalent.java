class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder str1=new StringBuilder();
         StringBuilder str2=new StringBuilder();
        for(String s: word1){
            str1.append(s);
        }
        for(String s1: word2){
            str2.append(s1);
        }
        char[] ch1=str1.toString().toCharArray();
         char[] ch2=str2.toString().toCharArray();
         return Arrays.equals(ch1,ch2);
    }
}