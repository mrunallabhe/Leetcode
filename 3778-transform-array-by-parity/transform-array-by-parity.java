class Solution {
    public int[] transformArray(int[] nums) {
        int n=nums.length;
        int[] result=new int[n];
        int even=0;
        int odd=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        for(int j=0;j<even;j++){
            result[j]=0;

        }
        for(int k=even;k<n;k++){
            result[k]=1;
        }
        return result;
    }
}