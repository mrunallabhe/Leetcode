class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words=text.split(" ");
        char[] ch=brokenLetters.toCharArray();
        HashSet<Character> set=new HashSet<>();
        for(char c:ch){
            set.add(c);
        }
        int count=0;
        for(String s:words){
        for(char ch1:s.toCharArray()){
            if(set.contains(ch1)){
                count++;
                break;
            }
        }
        }
        return words.length-count;
    }
}