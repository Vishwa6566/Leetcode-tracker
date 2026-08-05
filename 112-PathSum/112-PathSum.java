// Last updated: 8/5/2026, 2:02:43 PM
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {

        if (root == null)
            return false;

        if (root.left == null && root.right == null)
            return targetSum == root.val;

        return hasPathSum(root.left, targetSum - root.val) ||
               hasPathSum(root.right, targetSum - root.val);
    }
}