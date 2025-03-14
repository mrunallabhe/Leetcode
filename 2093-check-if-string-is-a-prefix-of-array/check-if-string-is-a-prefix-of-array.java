class Solution {
    public boolean isPrefixString(String s, String[] words) {
        int cnt=0;
        StringBuilder st=new StringBuilder();
        for(int i=0;i<words.length;i++){
          st.append(words[i]);
          System.out.println(st);
          if(st.toString().equals(s)){
            return true;
        }
        }
            return false;
    }
}