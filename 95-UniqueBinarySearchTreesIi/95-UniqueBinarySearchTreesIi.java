// Last updated: 8/5/2026, 2:13:39 PM
import java.util.*;

class Solution {

    public List<TreeNode> generateTrees(int n) {
        if (n == 0) return new ArrayList<>();
        return build(1, n);
    }

    private List<TreeNode> build(int start, int end) {

        List<TreeNode> trees = new ArrayList<>();

        if (start > end) {
            trees.add(null);
            return trees;
        }

        for (int i = start; i <= end; i++) {

            List<TreeNode> left = build(start, i - 1);
            List<TreeNode> right = build(i + 1, end);

            for (TreeNode l : left) {
                for (TreeNode r : right) {
                    TreeNode root = new TreeNode(i);
                    root.left = l;
                    root.right = r;
                    trees.add(root);
                }
            }
        }

        return trees;
    }
}