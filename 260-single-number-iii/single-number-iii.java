class Solution {
    public int[] singleNumber(int[] nums) {
        ArrayList<Integer> result=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer,Integer> it:map.entrySet()){
            if(it.getValue()==1){
                result.add(it.getKey());
            }
        }
         int[] arr = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            arr[i] = result.get(i);
        }
         return arr;
        
    }
}