class Solution {
    public int maxProduct(String[] words) {
        int max=0;
        
        for(int j=0;j<words.length;j++){
            
            HashSet<Character> set=new HashSet<>();
            for(char ch:words[j].toCharArray()){
                set.add(ch);

            }
            for(int i=j+1;i<words.length;i++){
                boolean common=false;
                for(char ch1:words[i].toCharArray()){
                    if(set.contains(ch1)){
                       common=true;
                       break;
                    }
                    
                }
                if(!common){
                max=Math.max(max,words[j].length()*words[i].length());
            }
        
            
            }
           
        }
        return max;
    }
}