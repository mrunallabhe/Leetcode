class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        ArrayList<Integer> arr=new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr.add(matrix[i][j]);

            }
        }
        int size=arr.size();
        int a[]=new int[size];
        for(int l=0;l<size;l++){
            a[l]=arr.get(l);
        }
        Arrays.sort(a);
        return a[k-1];
    }
}