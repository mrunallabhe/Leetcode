class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean flag=false;
        HashSet<Character> set=new HashSet<>();
        for(char ch:sentence.toCharArray()){
            set.add(ch);
        }
        if(set.size()==26){
            flag=true;
        }
        else{
            flag=false;
        }
        return flag;
    }
}