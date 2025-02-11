class Solution {
    public int countAsterisks(String s) {
        int count=0;
        int pair=0;
        for(char ch:s.toCharArray()){
            if(ch=='*' && pair%2==0){
                count++;
            }
            else if( ch=='|'){

                pair++;
        }
       
    }
     return count;
}
}