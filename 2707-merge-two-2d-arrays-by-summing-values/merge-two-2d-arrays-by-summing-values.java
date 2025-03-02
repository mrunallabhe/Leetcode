class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int i=0;
        int j=0;
        int n=nums1.length;
        int m=nums2.length;
            List<int[]> result=new ArrayList<>();
            while(i<n  && j<m){
               if(nums1[i][0]==nums2[j][0]){
                result.add(new int[]{nums1[i][0],nums1[i][1]+nums2[j][1]});
                i++;
                j++;
               } 
              else if(nums1[i][0]<nums2[j][0]){
                result.add(nums1[i]);
                i++;
               }
               else{
                result.add(nums2[j]);
                j++;
               }
              
            }
             while(i<n){
                result.add(nums1[i]);
                i++;

               }
               while(j<m){
                result.add(nums2[j]);
                j++;
               }
             return result.toArray(new int[result.size()][]);


        
    }
}