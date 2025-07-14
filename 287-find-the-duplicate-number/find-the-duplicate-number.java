class Solution {
    public int findDuplicate(int[] nums) {
        int num=0;
        HashMap<Integer,Integer> freqmap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            freqmap.put(nums[i],freqmap.getOrDefault(nums[i],0)+1);
        }
        for(int n:freqmap.keySet()){
            if(freqmap.get(n)>=2){
                num=n;
            }
        }
        return num;
        
    }
}