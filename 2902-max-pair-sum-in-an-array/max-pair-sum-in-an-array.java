class Solution {
    public int maxSum(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int maxSum=-1;
        for(int num:nums){
            int maxi=-1;
            int temp=num;
            while(temp>0){
                maxi=Math.max(maxi,temp%10);
                temp/=10; 
            }
            if(hm.containsKey(maxi)){
                maxSum=Math.max(maxSum,hm.get(maxi)+num);
                hm.put(maxi,Math.max(hm.get(maxi),num));
            }else{
                hm.put(maxi,num);
            }
        }
        return maxSum;
        
       

    }
}