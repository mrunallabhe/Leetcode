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
    public int countNodes(TreeNode root) {
        int max=0;
        while(root!=null){
            int leftsubtree=countNodes(root.left);
            int rightsubtree=countNodes(root.right);
            return max=
            1+leftsubtree+rightsubtree;
        }
        
        return max;
    }
}