class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map=new HashMap<>();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int num:nums1){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(int num:nums2){
            if(map.containsKey(num) && map.get(num)>0){
                arr.add(num);
                map.put(num, map.get(num)-1);
            }
        }
        int[] result=new int[arr.size()];
        int i=0;
        for(int num:arr){
            result[i++]=num;
        }
        return result;
    }
}