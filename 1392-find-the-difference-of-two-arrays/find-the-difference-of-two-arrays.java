class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> list1 = new HashSet<>();
        Set<Integer> list2 = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            list1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            list2.add(nums2[i]);
        }

        ArrayList<Integer> result1 = new ArrayList<>();
        ArrayList<Integer> result2 = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        for (int k = 0; k < nums1.length; k++) {
            if (!list2.contains(nums1[k]) && !result1.contains(nums1[k])) {
                result1.add(nums1[k]);
            }
        }

        for (int l = 0; l < nums2.length; l++) {
            if (!list1.contains(nums2[l]) && !result2.contains(nums2[l])) {
                result2.add(nums2[l]);
            }
        }

        result.add(result1);
        result.add(result2);
        return result;
    }
}
