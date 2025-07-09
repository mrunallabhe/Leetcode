class Solution {
    public int findLHS(int[] nums) {
        int maxlen=0;
        int max=0;
        HashMap<Integer,Integer> freqmap=new HashMap<>();
        for(int n:nums){
            freqmap.put(n,freqmap.getOrDefault(n,0)+1);
        }
        for(int k:freqmap.keySet()){
            if(freqmap.containsKey(k+1)){
                max=freqmap.get(k)+freqmap.get(k+1);
                maxlen=Math.max(max,maxlen);
            }
        }
        return maxlen;
        
    }
}