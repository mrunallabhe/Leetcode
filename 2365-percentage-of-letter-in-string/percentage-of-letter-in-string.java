class Solution {
    public int percentageLetter(String s, char letter) {
        int count=0;
        int n=s.length();
        for(char c:s.toCharArray()){
            if(c==letter){
                count++;
            }
        }
        return count*100/n;
        
    }
}