class Solution {
    public int countDistinctIntegers(int[] nums) {
        int n1=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int rev=0;
            set.add(nums[i]);
            int n=nums[i];
            while(n!=0){
            rev=rev*10+n%10;
            n=n/10;
            }
            set.add(rev);
           }
            return set.size();
        }

      
    }