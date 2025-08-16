class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int num=Math.abs(nums[i]);
            if(nums[num-1]<0){
                arr.add(num);
            }
            nums[num-1]*=-1;
        }
        return arr;
        
    }
}