class Solution {
    public int search(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) return mid;

            // Check if left half is sorted
            if (arr[low] <= arr[mid]) {
                if (arr[low] <= target && target < arr[mid]) { // Corrected condition
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } 
            // Right half must be sorted
            else {
                if (arr[mid] < target && target <= arr[high]) { // Corrected condition
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
