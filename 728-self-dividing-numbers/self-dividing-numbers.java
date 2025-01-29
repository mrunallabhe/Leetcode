class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isSeldDivide(i)) result.add(i);
        }
        return result;
    }
     private  boolean isSeldDivide(int number){
        int original_number=number;
        while(number>0){
            int digit=number%10;
            number /=10;
            if(digit == 0  ||  original_number % digit !=0 ) return false ;
        }
        return true;
      }
}
        
    
