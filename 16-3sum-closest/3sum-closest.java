class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closetsum=nums[0]+nums[1]+nums[2];
        int sum=0;
        for(int i=0;i<nums.length-2;i++){
            int right=i+1;
            int left=nums.length-1;
            while(right<left){
            sum=nums[i]+nums[right]+nums[left];
            if(Math.abs(sum-target)<Math.abs(closetsum-target)){
                closetsum=sum;
            }
            if(sum<target){
                right++;
            }
            else if(sum>target){
                left--;
            }
            else{
                return sum;
            }
        }
        }
        return closetsum;
    }
}