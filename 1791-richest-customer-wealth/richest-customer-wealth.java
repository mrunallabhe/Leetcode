class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum=0;
        int max=-1000;
        for(int i=0;i<accounts.length;i++){
            sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
             max=Math.max(max,sum);
        }
        return max;
       

        
    }
}