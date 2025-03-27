class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int xorresult=0;
        HashMap<Integer,Integer> res=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            res.put(nums[i],res.getOrDefault(nums[i],0)+1);

        }
        for(int key:res.keySet()){
            if(res.get(key)==2){
                xorresult=xorresult^key;
            }
        }
        return xorresult;
    }
}