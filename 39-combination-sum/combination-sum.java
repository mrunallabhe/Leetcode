class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> num = new ArrayList<>();
        findsum(candidates, target, 0, num, result); 
        return result;
    }

    public static void findsum(int[] candidates, int target, int index, ArrayList<Integer> num, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(num));
            return; 
        }
        if (index == candidates.length || target < 0) {
            return; 
        }

       
        if (candidates[index] <= target) {
            num.add(candidates[index]);
            findsum(candidates, target - candidates[index], index, num, result); 
            num.remove(num.size() - 1);
        }

        
        findsum(candidates, target, index + 1, num, result);
    }
}
