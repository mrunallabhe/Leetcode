class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                str.append(Character.toLowerCase(ch));
            }
        }
        String newstr=str.toString();
     int left=0;
     int right=newstr.length()-1;
     boolean pali=true;
     while(left<right){
        if(newstr.charAt(right)!=newstr.charAt(left)){
            return false;
        }
        left++;
        right--;
       
     }
        return true;
    }
}