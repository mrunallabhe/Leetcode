class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        int idx=0;
      
        int[] a=new int[n];
        for(int i=0;i<n;i++){
              int count=0;
            for(int j=0;j<n;j++){
                if(nums[j]<nums[i] && i!=j){
                    count++;
                }
                a[i]=count;
            }
        }
        return a;
    }
}