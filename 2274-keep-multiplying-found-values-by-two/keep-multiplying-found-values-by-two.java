class Solution {
    public int findFinalValue(int[] nums, int original) {
        Set<Integer> result=new HashSet<>();
        for(int n:nums){
            result.add(n);
        }
        while(result.contains(original)){
            original=original*2;
        }
        return original;
        
        
        
    }
}