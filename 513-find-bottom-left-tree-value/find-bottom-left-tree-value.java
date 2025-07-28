/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static void solve(ArrayList<Integer> arr, TreeNode root, int level){
        if(root == null){
            return;
        }
        if(level == arr.size()){
            arr.add(root.val);
        }
        solve(arr, root.left, level + 1);
        solve(arr, root.right, level + 1);
    }

    public int findBottomLeftValue(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        solve(arr, root, 0);
        return arr.get(arr.size() - 1);
    }
}