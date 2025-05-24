class Solution {
    public int[] countPoints(int[][] arr, int[][] nums) {
        int[] result=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int r=nums[i][2];
            int xc=nums[i][0];
            int yc=nums[i][1];
            int count=0;
            for(int j=0;j<arr.length;j++){
                int x=arr[j][0];
                int y=arr[j][1];
                int a=x-xc;
                int b=y-yc;
                if((Math.pow(a,2)+Math.pow(b,2))<=(r*r)){
                    count++;
                }
            }
            result[i]=count;
        }
        return result;
    }
}