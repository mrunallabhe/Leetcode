class Solution {
    public String reverseVowels(String s) {
        HashSet<Character> set=new HashSet<>();
        set.add('a');
         set.add('e');
          set.add('i');
           set.add('o'); 
           set.add('u');
           set.add('A');
         set.add('E');
          set.add('I');
           set.add('O'); 
           set.add('U');
        
        StringBuilder vowel=new StringBuilder();
        for(char ch:s.toCharArray()){
            char ch1=Character.toLowerCase(ch);
            if(ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u'){
                vowel.append(ch);
            }
        }
        String finalvowel=vowel.toString();
        StringBuilder result=new StringBuilder();
        int len=finalvowel.length()-1;
        for(char c:s.toCharArray()){
            if(!set.contains(c)){
                result.append(c);
            }
            else{
                result.append(finalvowel.charAt(len));
                len--;
            }
        }
        return result.toString();
        
    }
}