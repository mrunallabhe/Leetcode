class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int count=0;
        Set<Integer> result=new HashSet<>();
        for(int n:nums){
            result.add(n);
        }
        for(int i=0;i<nums.length;i++){
            Set<Integer> set=new HashSet<>();
            for(int j=i;j<nums.length;j++ ){
                set.add(nums[j]);
                  if(set.size()==result.size()){
                count++;
            }
            }
          
            
        }
        return count;
        
    }
}