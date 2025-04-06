class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n=g.length;
        int m=s.length;
        int count=0;
        Arrays.sort(g);
        Arrays.sort(s);
        int l=0;
        int r=0;
        while(l<n && r<m){
            if(s[r]>=g[l]){
                count++;
                l++;
                r++;
            }
            else if(s[r]<g[l]){
                r++;

            }
        }
        return count;
        
    }
}