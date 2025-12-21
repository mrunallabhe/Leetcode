class Solution {
    public void reverseString(char[] s) {
        int left=0;
        int right=s.length-1;
        while(left<=right){
            swap( s ,right,left);
            left++;
            right--;
        }
        
        
    }
    private void swap(char[] s,int right,int left){
        char ch=s[left];
        s[left]=s[right];
        s[right]=ch;
    }
}