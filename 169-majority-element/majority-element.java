class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int majority=0;
        int    res=0;
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
            if(map.get(i)>majority){
                res=i;
                majority=map.get(i);
            }
        }
        return res;
    }
}