class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;
        Arrays.sort(nums);
        int cnt=0;
        int longest=1;
        int lastsmaller=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]-1==lastsmaller){
                cnt+=1;
               lastsmaller=nums[i];
            }
            else if(nums[i]!=lastsmaller){
                cnt=1;
                 lastsmaller = nums[i];

            }
            longest=Math.max(cnt,longest);

        }
        return longest;
        
    }
}