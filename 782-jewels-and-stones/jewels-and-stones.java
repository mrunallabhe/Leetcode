class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> map=new HashSet<>();
        int count=0;
        for(char ch:jewels.toCharArray()){
            map.add(ch);
        }
        for(char ch1 :stones.toCharArray()){
            if(map.contains(ch1)){
                count+=1;
            }
        }
        return count;
        
    }
}