class Solution {
    public int findNumbers(int[] nums) {
        int mainCount = 0;
        for(int element:nums){
            int countDigit = countDigit(element);
            if(countDigit%2==0){
                mainCount++;
            }
        }
        return mainCount;
    }
    int countDigit(int number){
        int count = 0;
        if(number<0){
            number=number*(-1);
        }

        while(number!=0){
            int digit = number%10;
            number=number/10;
            count++;
        }
        return count;
    }
}