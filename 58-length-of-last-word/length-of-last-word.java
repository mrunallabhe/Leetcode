class Solution {
    public int lengthOfLastWord(String s) {
        String str[]=s.trim().split("\\s+");
      //  System.out.println(str);
      int len=str.length-1;
       
        return str[len].length() ;
        
    }
}