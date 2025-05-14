class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            for(char ch:words[i].toCharArray()){
                if(ch==x){
                    result.add(i);
                    break;
                }
            }

        }
        return result;
        
    }
}