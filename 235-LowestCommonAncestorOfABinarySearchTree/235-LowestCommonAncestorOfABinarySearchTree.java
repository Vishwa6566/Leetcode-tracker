// Last updated: 8/5/2026, 1:56:17 PM
class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root,
                                         TreeNode p,
                                         TreeNode q) {

        while (root != null) {

            if (p.val < root.val && q.val < root.val)
                root = root.left;

            else if (p.val > root.val && q.val > root.val)
                root = root.right;

            else
                return root;
        }

        return null;
    }
}