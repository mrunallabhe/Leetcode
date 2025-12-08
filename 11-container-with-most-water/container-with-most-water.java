class Solution {
    public int maxArea(int[] height) {
        int right=height.length-1;
        int left=0;
        int maxarea=0;
        int area=0;
        int minheight=0;
        while(left<right){
            minheight=Math.min(height[left],height[right]);
            area=minheight*(right-left);
            maxarea=Math.max(maxarea,area);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxarea;
        
    }
}