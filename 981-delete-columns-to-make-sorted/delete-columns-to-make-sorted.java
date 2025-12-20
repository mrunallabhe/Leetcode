class Solution {
    public int minDeletionSize(String[] strs) {
        int index=strs[0].length();
        int rows=strs.length;
        int count=0;
        int j=0;
        String copy;
        while(j<index){
            StringBuilder str=new StringBuilder();
        for(int i=0;i<rows;i++){
            str.append(strs[i].charAt(j));
            
        }
        copy=str.toString();
        j++;
        char[] ch=str.toString().toCharArray();
        Arrays.sort(ch);

        if(!copy.equals(new String(ch))){
            count++;
        }
        }
        return count;
    }
}