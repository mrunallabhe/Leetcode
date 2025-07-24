class Solution {
    public void flatten(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        preorderTraversal(root, arr);
        TreeNode curr = root;
        for (int i = 1; i < arr.size(); i++) {
            curr.left = null;
            curr.right = new TreeNode(arr.get(i));
            curr = curr.right;
        }
    }
    private void preorderTraversal(TreeNode root, List<Integer> arr) {
        if (root == null) return;
        arr.add(root.val);
        preorderTraversal(root.left, arr);
        preorderTraversal(root.right, arr);
    }
}