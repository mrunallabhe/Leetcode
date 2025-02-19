class Solution {
    public int bitwiseComplement(int n) {
        if(n==0) return 1;
        int bitlength=Integer.toBinaryString(n).length();
       int  mask=(1 << bitlength)-1;
       return n^mask;
        
    }
}