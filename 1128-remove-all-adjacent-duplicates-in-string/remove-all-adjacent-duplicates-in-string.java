import java.util.*;
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
           
            if(!st.isEmpty() && st.peek()==ch){
                char ele=st.pop();
            }
            
            else{
            st.push(ch);
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
         char  element=st.pop();
         sb.append(element);

        }
        sb.reverse();
        return sb.toString();
    }
}