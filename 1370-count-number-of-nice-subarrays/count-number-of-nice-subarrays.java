class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        int count = 0;    
        int count1 = 0;  
        int[] freq = new int[n + 1];
        freq[0] = 1;       

        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 != 0) {
                count++; 
            }

            if (count - k >= 0) {
                count1 += freq[count - k]; 
            }

            freq[count]++;
        }

        return count1;
    }
}
