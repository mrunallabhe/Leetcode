class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder s=new StringBuilder();
        int i=0;
        int j=0;
        int n=word1.length();
        int m=word2.length();
        while(i!=n || j!=m){
            if(i<n){
            s.append(word1.charAt(i));
             i++;
            }
            if(j<m){
            s.append(word2.charAt(j));
            j++;
            }
        }
        if(i!=n){
            for(int k=i+1;k<n;k++){
                s.append(word1.charAt(k));
            }
        }
        else if(j!=m && j<m){
            for(int l=j+1;l<m;l++){
                s.append(word1.charAt(l));
            }
        }

        return s.toString();
        
    }
}