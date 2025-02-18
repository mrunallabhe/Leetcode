class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
             HashSet<Integer> set= new HashSet<>();
              for(int i:nums1)
              {
                for(int j:nums2)
                {
                    if(i==j)set.add(i);
                }
              }
               for(int i:nums2)
              {
                for(int j:nums3)
                {
                    if(i==j)set.add(i);
                }
              }
              for(int i:nums1)
              {
                for(int j:nums3)
                {
                    if(i==j)set.add(i);
                }
              }
              List<Integer> list = new ArrayList<>(set);
              return list;
    }
}