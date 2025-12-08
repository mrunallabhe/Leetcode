class Solution {
    public boolean isPalindrome(int x) {
        int org=x;
        int n=0;
        int num=0;
        if(x<0) return false;
        while(x!=0){
            n=x%10;
            num=num*10+n;
            x=x/10;

        }
        System.out.println(num);
        if(org==num){
            return true;
        }
        return false;
        
    }
}