class Solution {
    public int balancedStringSplit(String s) {
        int lcount=0;
        int rcount=0;
        int count=0;
        for(char ch:s.toCharArray()){
            if(ch=='R'){
                rcount++;
            }
            else{
                lcount++;
            }
            if(rcount==lcount){
                count++;
            }
        }
        return count;
    }
}