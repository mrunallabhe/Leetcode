class Solution {
    public boolean lemonadeChange(int[] nums) {
        int n=nums.length;
        int five=0,ten=0;
        for(int i=0;i<n;i++){
            if(nums[i]==5){
                five++;
            }
            else if(nums[i]==10){
             if(five>0){
                five--;
                ten++;
             }
             else {
                return false;
             }

            }
            else if(nums[i]==20){
                if(five>0 && ten>0){
                    five--;
                    ten--;
                }
                 else if(five>=3){
                       
                        five-=3;
                    }
                    else{
                        return false;
                    }
                
            }


        }
        return true;
    }
}