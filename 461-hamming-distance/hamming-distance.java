class Solution {
    public int hammingDistance(int x, int y) {
        String str = Integer.toBinaryString(x^y);
        return count(str,'1');
    }
    public int count(String str,char value){
        int count=0;
        for (int i=0;i<str.length();i++){
            char a=str.charAt(i);
            if (a==value){
                count++;
            }
        }
        return count;
    }
}