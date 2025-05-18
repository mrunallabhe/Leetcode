class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for (int num : nums1) {
            set1.add(num);
        }
        
        for (int num : nums2) {
            set2.add(num);
        }
        
        // Create copies to perform set difference
        Set<Integer> onlyInNums1 = new HashSet<>(set1);
        Set<Integer> onlyInNums2 = new HashSet<>(set2);
        
        onlyInNums1.removeAll(set2);  // Elements in nums1 but not in nums2
        onlyInNums2.removeAll(set1);  // Elements in nums2 but not in nums1
        
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>(onlyInNums1));
        result.add(new ArrayList<>(onlyInNums2));
        
        return result;
    }
}
