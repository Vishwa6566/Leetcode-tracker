// Last updated: 8/5/2026, 1:56:45 PM
class Solution {

    public TreeNode invertTree(TreeNode root) {

        if (root == null)
            return null;

        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);

        return root;
    }
}