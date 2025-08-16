class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> arr=new ArrayList<>();
        int max=0;
        for(int n : candies){
            max=Math.max(n,max);
        }
        for(int k:candies){
            if(extraCandies+k>=max){
                arr.add(true);
            }
            else{
                arr.add(false);
            }
        }
        return arr;
        
    }
}