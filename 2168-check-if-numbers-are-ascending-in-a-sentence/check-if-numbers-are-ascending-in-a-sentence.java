class Solution {
    public boolean areNumbersAscending(String s) {
        String[] words = s.split(" ");
        int prevNumber = -1;

        for(String word : words){
            if(Character.isDigit(word.charAt(0))){
                int currNumber = Integer.parseInt(word);

                if (currNumber <= prevNumber){
                    return false;
                }
                prevNumber = currNumber;
            }
        }

        return true;
    }
}