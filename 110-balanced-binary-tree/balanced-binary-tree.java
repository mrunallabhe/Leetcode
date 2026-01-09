class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;

        int ldepth = maxdepth(root.left);
        int rdepth = maxdepth(root.right);

        if (Math.abs(ldepth - rdepth) > 1) {
            return false;
        }

        return isBalanced(root.left) && isBalanced(root.right);
    }

    public int maxdepth(TreeNode l) {
        if (l == null) return 0;

     
        int left = maxdepth(l.left);
        int right = maxdepth(l.right);

        return Math.max(left, right) + 1;
    }
}
