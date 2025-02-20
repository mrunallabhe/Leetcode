class Solution {
    public int findMin(int[] arr) {
        int low=0;
        int ans=Integer.MAX_VALUE;
        int high=arr.length-1;
        while(low<=high){
          int  mid=(high+low)/2;
            if(arr[mid]>=arr[low]){
                ans=Math.min(ans,arr[low]);
                low=mid+1;
            }
            else{
                ans=Math.min(ans,arr[mid]);
                high=mid-1;
            }
        }
         return ans;
    }
   
}