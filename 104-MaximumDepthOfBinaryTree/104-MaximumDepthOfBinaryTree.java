// Last updated: 8/5/2026, 2:03:14 PM
class Solution {
    public int maxDepth(TreeNode root) {

        if (root == null)
            return 0;

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}