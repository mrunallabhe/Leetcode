class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] Resultless = new int[n];  // Fixed: Use an array instead of ArrayList
        int[] Resultgreat = new int[n]; // Fixed: Use an array instead of ArrayList

        int index = 0, count = 0, pivotCount = 0;

        // First pass: Separate elements into two arrays
        for (int i = 0; i < n; i++) {
            if (nums[i] < pivot) {
                Resultless[index++] = nums[i];
            } else if (nums[i] > pivot) {
                Resultgreat[count++] = nums[i];
            } else {
                pivotCount++; // Count occurrences of pivot
            }
        }

        // Merge result arrays back into nums
        int[] result = new int[n];
        int k = 0;

        // Copy less than pivot
        for (int i = 0; i < index; i++) {
            result[k++] = Resultless[i];
        }

        // Copy pivot occurrences
        for (int i = 0; i < pivotCount; i++) {
            result[k++] = pivot;
        }

        // Copy greater than pivot
        for (int i = 0; i < count; i++) {
            result[k++] = Resultgreat[i];
        }

        return result;
    }
}