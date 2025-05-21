class Solution {
    public int maxFreqSum(String s) {
        int vow[]=new int[26];
        int con[]=new int[26];
        for(char i:s.toCharArray())
        {
            if(i=='a' || i=='e' || i=='o' || i=='i' || i=='u')
            vow[i-'a']++;
            else
            con[i-'a']++;
        }
       int v=0,c=0;
       for(int i=0;i<26;i++){
        v=Math.max(v,vow[i]);
        c=Math.max(c,con[i]);
       }
       return v+c;
    }
}